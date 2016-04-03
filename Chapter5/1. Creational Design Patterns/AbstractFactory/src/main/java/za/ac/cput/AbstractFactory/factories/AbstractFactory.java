package za.ac.cput.AbstractFactory.factories;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class AbstractFactory {
    public FruitFactory getFruitFactory(String type)
    {
        if("citrus".equals(type))
            return new CitrusFactory();
        else
            return new TropicalFactory();
    }
}
