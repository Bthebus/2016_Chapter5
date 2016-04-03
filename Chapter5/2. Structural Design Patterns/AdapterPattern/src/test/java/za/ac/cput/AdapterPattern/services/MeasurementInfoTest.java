package za.ac.cput.AdapterPattern.services;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public class MeasurementInfoTest extends TestCase{

    private MeasurementInfo mi;

    @Before
    public void setUp() throws Exception
    {
        mi = new MeasurementInfo() {
            @Override
            public double getMetric() {
                return 5;
            }

            @Override
            public double getImperial() {
                return 3.1068559611866697;
            }

            @Override
            public void setMetric(double metric) {

            }

            @Override
            public void setImperial(double imperial) {

            }
        };
    }

    @After
    public void tearDown() throws Exception
    {
        mi = null;
    }

    @Test
    public void testMeasurementInMetric() throws Exception
    {
        assertEquals(5.0, mi.getMetric(), .0);
    }

    @Test
    public void testMeasurementInImperial() throws Exception
    {
        assertEquals(3.1068559611866697, mi.getImperial());
    }
}
