package za.ac.cput.BuilderPattern;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.BuilderPattern.appConfig.AppConfig;
import za.ac.cput.BuilderPattern.domain.Car;
import za.ac.cput.BuilderPattern.impl.BmwCarBuilder;
import za.ac.cput.BuilderPattern.impl.FordCarBuilder;
import za.ac.cput.BuilderPattern.services.CarBuilder;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class BmwCarBuilderTest extends TestCase {
    private ApplicationContext ctx;
    private CarBuilder carBuilder;
    private CarDirector carDirector;
    private Car car;

    @Before
    public void setUp() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        carBuilder = new BmwCarBuilder();
        carDirector = new CarDirector(carBuilder);
        carDirector.constructCar();
        car = (Car) ctx.getBean("car");
    }

    @After
    public void tearDown() throws Exception {
        ctx = null;
        carBuilder = null;
        carDirector = null;
        car = null;
    }

    @Test
    public void testBuildEngine() throws Exception {

        assertEquals("Supercharged engine", carBuilder.buildEngine());
    }

    @Test
    public void testBuildBody() throws Exception {
        assertEquals("Carbon fibre", carBuilder.buildBody());
    }

    @Test
    public void testBuildSuspension() throws Exception {
        assertEquals("German engineered suspension", carBuilder.buildSuspension());
    }

    @Test
    public void testBuildWheels() throws Exception {
        assertEquals("Racing wheels", carBuilder.buildWheels());
    }
}