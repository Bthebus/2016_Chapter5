package za.ac.cput.FactoryPattern;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.FactoryPattern.appConfig.AppConfig;
import za.ac.cput.FactoryPattern.impl.Penguin;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class PenguinTest extends TestCase {

    private ApplicationContext ctx;
    private Penguin penguin;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        penguin = (Penguin)ctx.getBean("penguin");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        penguin = null;
    }

    @Test
    public void testWalk() throws Exception
    {
        assertEquals("Penguin walks", penguin.walk());
    }

    @Test
    public void testRun() throws Exception
    {
        assertEquals("Penguin runs", penguin.run());
    }

    @Test
    public void testSwim() throws Exception
    {
        assertEquals("Penguin swims", penguin.swim());
    }

    @Test
    public void testMakeSound() throws Exception
    {
        assertEquals("Shrill", penguin.makeSound());
    }
}
