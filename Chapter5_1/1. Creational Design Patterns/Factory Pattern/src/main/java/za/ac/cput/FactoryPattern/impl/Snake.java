package za.ac.cput.FactoryPattern.impl;

import za.ac.cput.FactoryPattern.services.Animal;
import za.ac.cput.FactoryPattern.services.NonLeggedLandCreature;
import za.ac.cput.FactoryPattern.services.SwimmingCreature;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Snake implements NonLeggedLandCreature, SwimmingCreature, Animal{
    @Override
    public String slither() {
        return "Snake slithers";
    }

    @Override
    public String swim() {
        return "Snake swims";
    }

    @Override
    public String makeSound() {
        return "Hiss";
    }
}
