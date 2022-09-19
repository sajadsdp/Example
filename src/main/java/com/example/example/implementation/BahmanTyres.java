package com.example.example.implementation;

import com.example.example.interfaces.Tyres;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Primary
public class BahmanTyres implements Tyres {

    public String rotate() {
        return "Vehicle Moving With Bahman Tyres";
    }
}
