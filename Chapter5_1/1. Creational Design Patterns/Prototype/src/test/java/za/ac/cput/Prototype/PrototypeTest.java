package za.ac.cput.Prototype;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Prototype.appConfig.AppConfig;
import za.ac.cput.Prototype.impl.Employee;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-27
 */
public class PrototypeTest extends TestCase {

    private Prototype prototype;
    private Employee emp;
    @Before
    public void setUp()
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        emp = (Employee)ctx.getBean("Employee");

        prototype = new Prototype() {
            @Override
            public Prototype doClone() {
                return new Employee("Braedy", "Thebus", "9212100558066", "3Fcp#5", 11);
            }
        };
    }

    @After
    public void tearDown()
    {
        prototype=null;
    }

    @Test
    public void testDoClone()
    {
        assertEquals(emp.getClass(), prototype.doClone().getClass());
    }
}
