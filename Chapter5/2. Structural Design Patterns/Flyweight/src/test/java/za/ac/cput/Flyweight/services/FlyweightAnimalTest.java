package za.ac.cput.Flyweight.services;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Flyweight.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-31
 */
public class FlyweightAnimalTest extends TestCase {

    private FlyweightAnimal tiger;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        tiger = (FlyweightAnimal)ctx.getBean("tiger");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        tiger = null;
    }

    @Test
    public void testMakeSound() throws Exception
    {
        assertEquals("rawrr", tiger.makeSound());
    }
}
