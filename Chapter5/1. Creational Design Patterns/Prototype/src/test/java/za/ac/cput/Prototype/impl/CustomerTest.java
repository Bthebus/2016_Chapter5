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
public class CustomerTest extends TestCase {

    private Customer cust;
    private Customer clonedCust;

    @Before
    public void setUp()
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        cust = (Customer)ctx.getBean("Customer");
        clonedCust = (Customer)cust.doClone();
    }

    @After
    public void tearDown()
    {
        cust = clonedCust = null;
    }

    @Test
    public void testGetName()
    {
        assertEquals("John", cust.getName());
    }

    @Test
    public void testGetSurname()
    {
        assertEquals("Smith", cust.getSurname());
    }

    @Test
    public void testGetPhoneNumber(){

        assertEquals("084 384 5615", cust.getPhoneNumber());
    }

    @Test
    public void testGetAge()
    {
        assertEquals(26, cust.getAge());
    }

    @Test
    public void testGetDob()
    {
        assertEquals("10/12/1988", cust.getDob());
    }

    @Test
    public void testGetCustomerID(){
        assertEquals(15, cust.getCustomerID());
    }

    @Test
    public void testDoClone()
    {
        assertEquals(cust.getClass(), clonedCust.getClass());
    }
}
