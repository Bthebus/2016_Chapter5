package za.ac.cput.Flyweight.impl;

import junit.framework.TestCase;
import org.junit.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Flyweight.appConfig.AppConfig;

import java.util.concurrent.TimeoutException;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-31
 */
public class FlyweightCatTest extends TestCase {

    private FlyweightCat cat;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cat= (FlyweightCat)ctx.getBean("cat");
    }

    @Test
    public void testMakeSound() throws Exception
    {
        assertEquals("meow", cat.makeSound());
    }

    @Test(timeout = 5000)
    public void testCreateObject() throws TimeoutException {
        assertNotNull(cat);
    }

}
