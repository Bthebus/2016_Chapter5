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
public class BmwCarBuilder implements CarBuilder {

    private ApplicationContext ctx;
    private Car car;

    public BmwCarBuilder() {

        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        car = (Car)ctx.getBean("car");
    }

    @Override
    public String buildEngine() {
        return "Supercharged engine";
    }

    @Override
    public String buildWheels() {
        return "Racing wheels";
    }

    @Override
    public String buildBody() {
        return "Carbon fibre";
    }

    @Override
    public String buildSuspension() {
        return "German engineered suspension";
    }

    @Override
    public Car getCar() {
        return car;
    }
}
