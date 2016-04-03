package za.ac.cput.Proxy.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.Proxy.Athlete;
import za.ac.cput.Proxy.Proxy;
import za.ac.cput.Proxy.impl.Jogger;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
@Configuration
public class AppConfig {

    @Bean(name = "athlete")
    public Athlete getAthlete()
    {
        return new Athlete("Braedy", "Thebus", 30);
    }

    @Bean(name = "jogger")
    public Jogger getJogger(){
        return new Jogger();
    }
}

