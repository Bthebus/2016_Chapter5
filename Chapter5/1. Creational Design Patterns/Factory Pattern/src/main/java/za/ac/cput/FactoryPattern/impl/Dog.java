package za.ac.cput.FactoryPattern.impl;

import za.ac.cput.FactoryPattern.services.Animal;
import za.ac.cput.FactoryPattern.services.LeggedLandCreature;
import za.ac.cput.FactoryPattern.services.SwimmingCreature;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Dog implements LeggedLandCreature, SwimmingCreature, Animal{


    @Override
    public String walk() {
        return "Dog walks";
    }

    @Override
    public String run() {
        return "Dog runs";
    }

    @Override
    public String swim() {
        return "Dog swims";
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
