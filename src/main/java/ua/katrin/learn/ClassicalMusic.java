package ua.katrin.learn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class ClassicalMusic implements Music{

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    List<String> songs = new ArrayList<>();


    {
        songs.add("Hungarian Rhapsody");
        songs.add("Symphony no. 5 in C Minor, op. 67");
        songs.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}
