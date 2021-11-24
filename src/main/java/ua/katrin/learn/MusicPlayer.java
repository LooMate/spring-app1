package ua.katrin.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private String volume;

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public void playMusic(MusicGenre genre) {
        Random random = new Random();

        int random_num = random.nextInt(3);

        if(genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSong().get(random_num) + getName() + ", " + getVolume());
        } else {
            System.out.println(rockMusic.getSong().get(random_num) + getName() + ", " + getVolume());
        }
    }
}