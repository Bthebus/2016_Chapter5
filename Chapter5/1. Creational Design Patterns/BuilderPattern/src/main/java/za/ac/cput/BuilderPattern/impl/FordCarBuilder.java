package za.ac.cput.BuilderPattern.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.BuilderPattern.appConfig.AppConfig;
import za.ac.cput.BuilderPattern.domain.Car;
import za.ac.cput.BuilderPattern.services.CarBuilder;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class FordCarBuilder implements CarBuilder{

    private ApplicationContext ctx;
    private Car car;

    public FordCarBuilder() {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        car = (Car)ctx.getBean("car");
    }

    @Override
    public String buildEngine() {
        return "2.0 litre";
    }

    @Override
    public String buildWheels() {
        return "20 inch";
    }

    @Override
    public String buildBody() {
        return "carbon fibre";
    }

    @Override
    public String buildSuspension() {
        return "stock suspension";
    }

    @Override
    public Car getCar() {
        return car;
    }
}
