package za.ac.cput.Flyweight.factories;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Flyweight.appConfig.AppConfig;
import za.ac.cput.Flyweight.impl.FlyweightCat;
import za.ac.cput.Flyweight.impl.FlyweightDog;
import za.ac.cput.Flyweight.services.FlyweightAnimal;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-31
 */
public class FlyweightFactoryTest extends TestCase {

    private FlyweightFactory flyweight;
    private FlyweightAnimal cat, dog;
    private ApplicationContext ctx;

    @Before
    public void setUp()throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        flyweight = (FlyweightFactory)ctx.getBean("factory");
        cat = (FlyweightCat)ctx.getBean("cat");
        dog = (FlyweightDog)ctx.getBean("dog");
    }

    @After
    public void tearDown() throws Exception{
        ctx=null;
        flyweight=null;
        cat = dog = null;
    }

    @Test
    public void testGetInstance() throws Exception
    {
        assertNotNull(FlyweightFactory.getInstance());
    }

    @Test
    public void testGetFlyweightAnimal() throws Exception
    {
        assertEquals(dog.makeSound(), flyweight.getFlyweightAnimal("bark").makeSound());
    }

}
