package za.ac.cput.AbstractFactory.factories;

import za.ac.cput.AbstractFactory.Fruit;
import za.ac.cput.AbstractFactory.impl.GrapeFruit;
import za.ac.cput.AbstractFactory.impl.Naartjie;
import za.ac.cput.AbstractFactory.impl.Orange;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class CitrusFactory extends FruitFactory{
    @Override
    public Fruit getFruit(String type) {
        if("orange".equals(type))
            return new Orange();
        else if("naartjie".equals(type))
            return new Naartjie();
        else
            return new GrapeFruit();
    }
}
