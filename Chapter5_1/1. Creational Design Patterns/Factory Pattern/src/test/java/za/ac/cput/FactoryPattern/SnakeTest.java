package za.ac.cput.FactoryPattern;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.FactoryPattern.appConfig.AppConfig;
import za.ac.cput.FactoryPattern.impl.Snake;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class SnakeTest extends TestCase{

    private ApplicationContext ctx;
    private Snake snake;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        snake = (Snake)ctx.getBean("snake");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx =null;
        snake = null;
    }

    @Test
    public void testSlither() throws Exception
    {
        assertEquals("Snake slithers", snake.slither());
    }

    @Test
    public void testSwim() throws Exception
    {
        assertEquals("Snake swims", snake.swim());
    }

    @Test
    public void testMakeSound() throws Exception{
        assertEquals("Hiss", snake.makeSound());
    }
}
