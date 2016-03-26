package za.ac.cput.FactoryPattern.appConfig;

import org.springframework.context.annotation.Bean;
import za.ac.cput.FactoryPattern.factories.AnimalFactory;
import za.ac.cput.FactoryPattern.services.Animal;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class AppConfig {

    private AnimalFactory animalFactory = new AnimalFactory();
    private Animal dog, snake, penguin;
    @Bean(name="dog")
    public Animal getDog()
    {
        dog = animalFactory.getAnimal("canine");
        return dog;
    }

    @Bean(name="snake")
    public Animal getSnake()
    {
        snake = animalFactory.getAnimal("serpant");
        return snake;
    }

    @Bean(name="penguin")
    public Animal getPenguin()
    {
        penguin = animalFactory.getAnimal("avian");
        return penguin;
    }
}
