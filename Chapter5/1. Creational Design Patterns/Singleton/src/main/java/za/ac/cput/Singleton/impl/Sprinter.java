package za.ac.cput.Singleton.impl;

import za.ac.cput.Singleton.Athlete;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Sprinter  extends Athlete {

    private String name;
    private String surname;
    private double weight;
    private double height;
    private String event;
    private static Sprinter sprinter;

    public Sprinter(String name, String surname, double weight, double height, String event) {
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
        this.event = event;
    }

    public static Sprinter getInstance(String name, String surname, double height, double weight, String event)
    {
        if(sprinter==null)
            sprinter = new Sprinter(name, surname, height, weight, event);
        return sprinter;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getEvent() {
        return event;
    }
}
