package za.ac.cput.Composite.services;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Composite.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class ComponentTest extends TestCase {

    private Component component;
    private ApplicationContext ctx;

    @Before
    public void setUp()throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        component = (Component)ctx.getBean("ComponentTest");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx=null;
        component = null;
    }

    @Test
    public void testName() throws Exception{
        assertEquals("Braedy", component.getName());
    }

    @Test
    public void testSurname() throws Exception{
        assertEquals("Thebus", component.getSurname());
    }

    @Test
    public void testAge() throws Exception{
        assertEquals(23, component.getAge());
    }
}
