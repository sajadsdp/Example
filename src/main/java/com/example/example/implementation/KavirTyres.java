package com.example.example.implementation;

import com.example.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class KavirTyres implements Tyres {

    public String rotate() {
        return "Vehicle Moving With Kavir Tyres";
    }
}
