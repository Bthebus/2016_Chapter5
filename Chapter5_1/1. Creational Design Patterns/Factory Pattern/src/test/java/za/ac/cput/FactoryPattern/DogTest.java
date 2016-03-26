package za.ac.cput.FactoryPattern;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.FactoryPattern.appConfig.AppConfig;
import za.ac.cput.FactoryPattern.impl.Dog;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class DogTest extends TestCase {

    private ApplicationContext ctx;
    private Dog dog;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        dog = (Dog)ctx.getBean("dog");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx =null;
        dog = null;
    }

    @Test
    public void testWalk() throws Exception{
        assertEquals("Dog walks", dog.walk());
    }
    @Test
    public void testRun() throws Exception
    {
        assertEquals("Dog runs", dog.run());
    }

    @Test
    public void testSwim() throws Exception{
        assertEquals("Dog swims", dog.swim());
    }

    @Test
    public void testMakeSound() throws Exception {
        assertEquals("Bark", dog.makeSound());
    }
}
