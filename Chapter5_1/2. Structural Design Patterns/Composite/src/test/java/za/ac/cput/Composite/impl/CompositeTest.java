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
public class CompositeTest extends TestCase{

    private Composite composite;
    private Person person, removePerson;
    private ApplicationContext ctx;

    @Before
    public void setUp()throws Exception{
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        person = (Person)ctx.getBean("person2");
        removePerson=(Person)ctx.getBean("person3");
        composite = (Composite)ctx.getBean("composite");

        composite.add(person);
        composite.add(removePerson);
    }

    @After
    public void tearDown()throws Exception{
        ctx = null;
        person = removePerson = null;
        composite = null;
    }

    @Test
    public void testAdd()throws Exception{

        composite.add(new Person("Braedy", "Thebus", 23));

        // test hashcodes to check equality
        assertEquals(person.hashCode(), composite.getComponent(0).hashCode());
        assertEquals(removePerson.hashCode(), composite.getComponent(1).hashCode());
        assertEquals(new Person("Braedy", "Thebus", 23).hashCode(), composite.getComponent(2).hashCode());
    }

    @Test
    public void testRemove()throws IndexOutOfBoundsException{
        composite.remove(removePerson);
        //check to see if first element still in the list
        assertEquals(person.hashCode(), composite.getComponent(0).hashCode());

        //check to see if desired element is removed
        assertEquals(1, composite.getComponents().size());
    }

    @Test
    public void testGetComponents()throws Exception{
        assertTrue(composite.getComponents().contains(person));
        assertTrue(composite.getComponents().contains(removePerson));
    }
     @Test
    public void testGetComponent()throws Exception{
        assertEquals(person, composite.getComponent(0));
        assertEquals(removePerson, composite.getComponent(1));
    }
}
