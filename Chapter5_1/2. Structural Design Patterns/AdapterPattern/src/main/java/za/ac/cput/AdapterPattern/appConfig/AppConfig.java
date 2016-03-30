package za.ac.cput.AdapterPattern.appConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.AdapterPattern.KilometerReporter;
import za.ac.cput.AdapterPattern.impl.ConversionClassReporter;
import za.ac.cput.AdapterPattern.services.MeasurementInfo;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
@Configuration
public class AppConfig {

    @Bean(name = "kilometerReporter")
    public KilometerReporter getKilometerReporter()
    {
        return new KilometerReporter(5);
    }

    @Bean(name="measurementInfo")
    public MeasurementInfo getMI()
    {
        return new ConversionClassReporter(5,5,3.10685596118667);
    }
}
