package com.example.example.main;

import com.example.example.beans.Person;
import com.example.example.beans.Vehicle;
import com.example.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example {

    public static void main (String[] args){
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] vehicles = context.getBeanNamesForType(Vehicle.class);
        person.getVehicle().getVehicleService().moveVehicle();
        person.getVehicle().getVehicleService().playMusic();
    }
}
