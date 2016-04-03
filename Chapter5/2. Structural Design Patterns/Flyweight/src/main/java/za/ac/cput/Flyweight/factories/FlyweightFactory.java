package za.ac.cput.Flyweight.factories;

import za.ac.cput.Flyweight.impl.FlyweightCat;
import za.ac.cput.Flyweight.impl.FlyweightDog;
import za.ac.cput.Flyweight.services.FlyweightAnimal;

import java.util.HashMap;
import java.util.Map;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-31
 */
public class FlyweightFactory {

    private static FlyweightFactory flyweightFactory;
    private Map<String, FlyweightAnimal> flyweightPool;

    public FlyweightFactory() {
        flyweightPool = new HashMap<String, FlyweightAnimal>();
    }

    public static FlyweightFactory getInstance()
    {
        if(flyweightFactory==null)
            flyweightFactory = new FlyweightFactory();
        return flyweightFactory;
    }

    public  FlyweightAnimal getFlyweightAnimal(String key)
    {
        if(flyweightPool.containsKey(key))
            return flyweightPool.get(key);
        else
        {
            FlyweightAnimal animal;

            if("bark".equals(key))
                animal = new FlyweightDog();
            else
                animal= new FlyweightCat();

            flyweightPool.put(key, animal);
            return animal;
        }
    }
}
