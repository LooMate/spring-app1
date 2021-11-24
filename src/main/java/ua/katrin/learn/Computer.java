package ua.katrin.learn;

import org.springframework.beans.ExtendedBeanInfoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Computer {
    private int id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Computer(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    Random random = new Random();
    int ran = random.nextInt(3);

//    @Autowired
//    @Override
//    public String toString() {
////        return "Computer" + " " + id + " " + musicPlayer.playMusic(TrackClassical.class,Tz);
//    }
}
