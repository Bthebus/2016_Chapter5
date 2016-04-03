package za.ac.cput.Proxy;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Proxy.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class AthleteTest extends TestCase {

    private ApplicationContext ctx;
    private Athlete athlete;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        athlete = (Athlete)ctx.getBean("athlete");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        athlete = null;
    }

    @Test
    public void testGetName() throws Exception
    {
        assertEquals("Braedy", athlete.getName());
    }

    @Test
    public void testGetSurname() throws Exception
    {
        assertEquals("Thebus", athlete.getSurname());
    }

    @Test
    public void testGetTopSpeed() throws Exception
    {
        assertEquals(30, athlete.getTopSpeed(), .0);
    }

    @Test
    public void testObject() throws Exception
    {
       Athlete athlete2 = new Athlete("Braedy", "Thebus", 30);
        assertEquals(athlete2.hashCode(), athlete.hashCode());
    }
}
