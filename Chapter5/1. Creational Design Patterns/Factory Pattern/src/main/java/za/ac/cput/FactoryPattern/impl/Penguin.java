package za.ac.cput.FactoryPattern.impl;

import za.ac.cput.FactoryPattern.services.Animal;
import za.ac.cput.FactoryPattern.services.LeggedLandCreature;
import za.ac.cput.FactoryPattern.services.SwimmingCreature;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Penguin implements LeggedLandCreature, SwimmingCreature, Animal {
    @Override
    public String walk() {
        return "Penguin walks";
    }

    @Override
    public String run() {
        return "Penguin runs";
    }

    @Override
    public String swim() {
        return "Penguin swims";
    }

    @Override
    public String makeSound() {
        return "Shrill";
    }
}
