package za.ac.cput.Singleton.appConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import za.ac.cput.Singleton.impl.Sprinter;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
@Configuration
public class AppConfig {

    @Bean(name="sprinter")
    public Sprinter getSprinter()
    {
        Sprinter sprinter = Sprinter.getInstance("Braedy", "Thebus",1.6,78.2, "200 meter");
        return sprinter;
    }
}
