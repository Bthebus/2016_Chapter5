package za.ac.cput.FactoryPattern.factories;

import za.ac.cput.FactoryPattern.impl.Dog;
import za.ac.cput.FactoryPattern.impl.Penguin;
import za.ac.cput.FactoryPattern.impl.Snake;
import za.ac.cput.FactoryPattern.services.Animal;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class AnimalFactory {

    public Animal getAnimal(String type)
    {

        if("avian".equals(type))
            return new Penguin();
        else if("serpant".equals(type))
            return new Snake();
        else
            return new Dog();
    }
}
