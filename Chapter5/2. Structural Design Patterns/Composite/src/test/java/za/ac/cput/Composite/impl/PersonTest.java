package za.ac.cput.Composite.impl;

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
public class PersonTest extends TestCase{

    private Person person;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception{
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        person = (Person)ctx.getBean("person");
    }

    @After
    public void tearDown()throws Exception
    {
        ctx = null;
        person = null;
    }

    @Test
    public void testGetName() throws Exception{
        assertEquals("Yusra", person.getName());
    }

    @Test
    public void testGetSurname() throws Exception{
        assertEquals("Ismail", person.getSurname());
    }

    @Test
    public void testAge() throws Exception{
        assertEquals(21, person.getAge());
    }
}
