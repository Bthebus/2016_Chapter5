package za.ac.cput.AdapterPattern.impl;

import za.ac.cput.AdapterPattern.KilometerReporter;
import za.ac.cput.AdapterPattern.services.MeasurementInfo;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public class ConversionClassReporter extends KilometerReporter implements MeasurementInfo{

    private double metric;
    public double imperial;

    public ConversionClassReporter(double kilometre, double metric, double imperial)
    {
        super(kilometre);
        this.metric = metric;
        this.imperial = imperial;
    }

    @Override
    public double getMetric() {
        return metric;
    }

    @Override
    public double getImperial() {
        return imperial;
    }

    @Override
    public void setMetric(double metric) {
        this.metric = metric;
    }

    @Override
    public void setImperial(double imperial) {
        this.imperial = mileToKilometre(imperial);
    }

    private double kilometreToMile(double kilometre)
    {
        return kilometre*0.621371192237334;
    }

    private double mileToKilometre(double mile)
    {
        return mile*1.609344;
    }
}
