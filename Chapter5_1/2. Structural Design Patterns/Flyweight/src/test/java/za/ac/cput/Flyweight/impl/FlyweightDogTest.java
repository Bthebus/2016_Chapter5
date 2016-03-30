package za.ac.cput.Flyweight.impl;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Flyweight.appConfig.AppConfig;
import za.ac.cput.Flyweight.services.FlyweightAnimal;

import java.util.concurrent.TimeoutException;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-31
 */
public class FlyweightDogTest extends TestCase{

    private FlyweightDog dog;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        dog= (FlyweightDog)ctx.getBean("dog");
    }

    @Test
    public void testMakeSound() throws Exception
    {
        assertEquals("woof", dog.makeSound());
    }

    @Test(timeout = 5000)
    public void testCreateObject() throws TimeoutException{
        assertNotNull(dog);
    }
}
