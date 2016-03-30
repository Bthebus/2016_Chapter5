package za.ac.cput.Flyweight.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Flyweight.impl.FlyweightCat;
import za.ac.cput.Flyweight.impl.FlyweightDog;
import za.ac.cput.Flyweight.services.FlyweightAnimal;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
@Configuration
public class AppConfig {

    @Bean(name = "tiger")
    public FlyweightAnimal getFWA()
    {
        return new FlyweightAnimal() {
            @Override
            public String makeSound() {
                return "rawrr";
            }
        };
    }

    @Bean(name = "dog")
    public FlyweightDog getFWD()
    {
        return new FlyweightDog();
    }

    @Bean(name = "cat")
    public FlyweightCat getFWC()
    {
        return new FlyweightCat();
    }
}
