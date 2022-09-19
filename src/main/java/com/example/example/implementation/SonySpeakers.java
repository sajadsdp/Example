package com.example.example.implementation;

import com.example.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class SonySpeakers implements Speakers{

    public String makeSound() {
        return "Music Play With Sony Speakers";
    }
}
