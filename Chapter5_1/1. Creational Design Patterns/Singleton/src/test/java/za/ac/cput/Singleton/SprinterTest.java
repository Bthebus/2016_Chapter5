package za.ac.cput.Singleton;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Singleton.appConfig.AppConfig;
import za.ac.cput.Singleton.impl.Sprinter;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class SprinterTest extends TestCase {

    private ApplicationContext ctx;
    private Sprinter sprinter;

    @Before
    public void setUp() throws Exception
    {
       ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       sprinter = (Sprinter)ctx.getBean("sprinter");
    }

    @After
    public void tearDown() throws Exception{
        ctx= null;
        sprinter =null;
    }

    @Test
    public void testgetName()
    {
        assertEquals("Braedy", sprinter.getName());
    }

    @Test
    public void testGetSurname() throws Exception{
        assertEquals("Thebus", sprinter.getSurname());
    }

    @Test
    public void testGetHeight() throws Exception{
        assertEquals(1.6, sprinter.getHeight(), .0);
    }

    @Test
    public void testGetWeight() throws Exception
    {
        assertEquals(78.2, sprinter.getWeight(), .0);
    }

    @Test
    public void testGetEvent() throws Exception
    {
        assertEquals("200 meter", sprinter.getEvent());
    }

}
