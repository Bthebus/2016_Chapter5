package za.ac.cput.AbstractFactory.appConfig;

import org.springframework.context.annotation.Bean;
import za.ac.cput.AbstractFactory.Fruit;
import za.ac.cput.AbstractFactory.factories.AbstractFactory;
import za.ac.cput.AbstractFactory.factories.FruitFactory;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class AppConfig {

    private AbstractFactory abstractFactory = new AbstractFactory();
    private FruitFactory citrus = abstractFactory.getFruitFactory("citrus");
    private FruitFactory tropical = abstractFactory.getFruitFactory("tropical");
    private Fruit orange, naartjie, grapefruit, banana, strawberry, mango;
    @Bean(name="orange")
    public Fruit getOrange()
    {
        orange = citrus.getFruit("orange");
        return orange;
    }

    @Bean(name="naartjie")
    public Fruit getNaartjie()
    {
        naartjie = citrus.getFruit("naartjie");
        return naartjie;
    }

    @Bean(name="grapefruit")
    public Fruit getGrapeFruit()
    {
        grapefruit = citrus.getFruit("grapefruit");
        return grapefruit;
    }

    @Bean(name="banana")
    public Fruit getBanana()
    {
        banana = tropical.getFruit("banana");
        return banana;
    }
    @Bean(name="mango")
    public Fruit getMango()
    {
        mango = tropical.getFruit("mango");
        return mango;
    }

    @Bean(name="strawberry")
    public Fruit getStrawberry()
    {
        strawberry = tropical.getFruit("strawberry");
        return strawberry;
    }
}
