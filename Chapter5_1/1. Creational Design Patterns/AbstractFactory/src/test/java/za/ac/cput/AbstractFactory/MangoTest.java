package za.ac.cput.AbstractFactory;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.AbstractFactory.appConfig.AppConfig;
import za.ac.cput.AbstractFactory.impl.Mango;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class MangoTest extends TestCase{

    private ApplicationContext ctx;
    private Fruit mango;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mango = (Mango)ctx.getBean("mango");
    }

    @After
    public void tearDown() throws Exception
    {
        ctx = null;
        mango = null;
    }

    @Test
    public void testGetName() throws Exception{
        assertEquals("Mango", mango.getName());
    }
}
