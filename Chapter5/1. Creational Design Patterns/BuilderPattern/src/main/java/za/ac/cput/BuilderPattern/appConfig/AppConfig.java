package za.ac.cput.BuilderPattern.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.BuilderPattern.CarDirector;
import za.ac.cput.BuilderPattern.domain.Car;
import za.ac.cput.BuilderPattern.impl.BmwCarBuilder;
import za.ac.cput.BuilderPattern.impl.FordCarBuilder;
import za.ac.cput.BuilderPattern.services.CarBuilder;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
@Configuration
public class AppConfig {

    private CarBuilder ford, bmw;
    @Bean(name = "car")
    public Car getCar()
    {
        return new Car();
    }
}
