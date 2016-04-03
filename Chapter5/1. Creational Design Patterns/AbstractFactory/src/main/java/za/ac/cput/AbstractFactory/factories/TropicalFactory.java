package za.ac.cput.AbstractFactory.factories;

import za.ac.cput.AbstractFactory.Fruit;
import za.ac.cput.AbstractFactory.impl.Banana;
import za.ac.cput.AbstractFactory.impl.Mango;
import za.ac.cput.AbstractFactory.impl.Strawberry;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class TropicalFactory extends FruitFactory{
    @Override
    public Fruit getFruit(String type) {
        if("mango".equals(type))
            return new Mango();
        else if("banana".equals(type))
            return new Banana();
        else
            return new Strawberry();
    }
}
