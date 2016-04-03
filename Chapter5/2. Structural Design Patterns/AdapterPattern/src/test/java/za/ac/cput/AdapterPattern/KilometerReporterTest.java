package za.ac.cput.AdapterPattern;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.AdapterPattern.appConfig.AppConfig;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public class KilometerReporterTest extends TestCase{

    private KilometerReporter kr;
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        kr = (KilometerReporter)ctx.getBean("kilometerReporter");
    }

    @After
    public void tearDown() throws Exception
    {
        kr= null;
        ctx = null;
    }

    @Test
    public void testGetKilometer()
    {
        assertEquals(5.0, kr.getKilometre(), .0);
    }
}
