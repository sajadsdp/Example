package com.example.example.implementation;

import com.example.example.interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BossSpeakers implements Speakers {

    public String makeSound(){
        return "music play with Boss Speakers";
    }
}
