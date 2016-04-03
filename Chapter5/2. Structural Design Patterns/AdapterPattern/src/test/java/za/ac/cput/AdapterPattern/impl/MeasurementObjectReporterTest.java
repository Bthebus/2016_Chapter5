package za.ac.cput.AdapterPattern.impl;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.AdapterPattern.appConfig.AppConfig;
import za.ac.cput.AdapterPattern.services.MeasurementInfo;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public class MeasurementObjectReporterTest extends TestCase {

    private MeasurementInfo mi;
    private  ApplicationContext ctx;
    @Before
    public void setUp()
    {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        mi = (MeasurementInfo)ctx.getBean("measurementInfo");
    }

    @After
    public void tearDown()
    {
        mi = null;
        ctx = null;
    }

    @Test
    public void testGetMeasurementInMetric()
    {
        assertEquals(5.0, mi.getMetric());
    }

    @Test
    public void testGetMeasurementInImperial()
    {
        assertEquals(3.10685596118667, mi.getImperial());
    }
}
