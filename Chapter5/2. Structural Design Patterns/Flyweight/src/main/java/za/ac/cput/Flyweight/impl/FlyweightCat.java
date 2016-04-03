package za.ac.cput.Flyweight.impl;

import za.ac.cput.Flyweight.services.FlyweightAnimal;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class FlyweightCat implements FlyweightAnimal {

    String operation;
    public FlyweightCat() {
        operation = "meowing";
        try
        {
            //5 seconds to create

            Thread.sleep(5000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public String makeSound() {
        return "meow";
    }
}
