package za.ac.cput.AdapterPattern.impl;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.AdapterPattern.KilometerReporter;
import za.ac.cput.AdapterPattern.appConfig.AppConfig;
import za.ac.cput.AdapterPattern.services.MeasurementInfo;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public class MeasurementObjectReporter implements MeasurementInfo{

    KilometerReporter kilometerReporter;

    public MeasurementObjectReporter() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        kilometerReporter = (KilometerReporter)ctx.getBean("kilometerReporter");
    }

    @Override
    public double getMetric() {
        return kilometerReporter.getKilometre();
    }

    @Override
    public double getImperial() {
        return kilometerToMile(kilometerReporter.getKilometre());
    }

    @Override
    public void setMetric(double metric) {
        kilometerReporter.setKilometre(metric);
    }

    @Override
    public void setImperial(double imperial) {
        kilometerReporter.setKilometre(mileToKilometer(imperial));
    }

    private double kilometerToMile(double kilometer)
    {
        return (kilometer*0.621371192237334);
    }
    private double mileToKilometer(double mile) {
        return (mile * 1.609344);
    }
}
