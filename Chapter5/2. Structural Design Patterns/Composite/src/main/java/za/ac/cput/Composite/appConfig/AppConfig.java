package za.ac.cput.Composite.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Composite.impl.Composite;
import za.ac.cput.Composite.impl.Person;
import za.ac.cput.Composite.services.Component;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
@Configuration
public class AppConfig
{
    @Bean(name = "ComponentTest")
    public Component getComponent()
    {
        return new Component() {
            @Override
            public String getName() {
                return "Braedy";
            }

            @Override
            public String getSurname() {
                return "Thebus";
            }

            @Override
            public int getAge() {
                return 23;
            }
        };
    }

    @Bean(name = "person")
    public Person getPerson1()
    {
        return new Person("Yusra", "Ismail", 21);
    }

    @Bean(name = "person2")
    public Person getPerson2(){
        return new Person("Cuan", "Lee", 24);
    }

    @Bean(name = "person3")
    public Person getPerson3(){
        return new Person("Faizel", "Jabaar", 23);
    }

    @Bean(name = "composite")
    public Composite getComposite(){
        return new Composite();
    }

}
