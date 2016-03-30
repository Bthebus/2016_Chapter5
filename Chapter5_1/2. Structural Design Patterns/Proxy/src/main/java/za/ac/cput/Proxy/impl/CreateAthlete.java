package za.ac.cput.Proxy.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.Proxy.Athlete;
import za.ac.cput.Proxy.appConfig.AppConfig;

import java.util.Date;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public abstract class CreateAthlete {
    private Athlete athlete;
    private ApplicationContext ctx;

    public CreateAthlete() {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        athlete = (Athlete)ctx.getBean("athlete");
    }

    public void createAthlete(){
        System.out.println(this.getClass().getSimpleName()+": "+"\n"+athlete.getName()+" "+athlete.getSurname()+" age "+athlete.getTopSpeed()+ "\nCreated at "+ new Date());
    }
}
