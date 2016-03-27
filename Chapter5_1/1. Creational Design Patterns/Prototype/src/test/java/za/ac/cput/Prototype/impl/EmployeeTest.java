package za.ac.cput.Prototype.impl;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Prototype.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-27
 */
public class EmployeeTest extends TestCase {

    private Employee emp;
    private Employee clonedEmp;
    @Before
    public void setUp()
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)ctx.getBean("Employee");
        clonedEmp = (Employee)emp.doClone();
    }

    @After
    public void tearDown()
    {
        emp = clonedEmp = null;
    }

    @Test
    public void testGetName()
    {
        assertEquals("Braedy", emp.getName());
    }
    @Test
    public void testGetSurname()
    {
        assertEquals("Thebus", emp.getSurname());
    }

    @Test
    public void testGetIDNumber()
    {
        assertEquals("9212100558066", emp.getIDNumber());
    }

    @Test
    public void testGetTaxNumber()
    {
        assertEquals("3Fcp#5", emp.getTaxNumber());
    }

    @Test
    public void testGetEmployeeNumber()
    {
        assertEquals(11, emp.getEmployeeNumber());
    }

    @Test
    public void testDoClone()
    {
        assertEquals(emp.getClass(), clonedEmp.getClass());
    }
}
