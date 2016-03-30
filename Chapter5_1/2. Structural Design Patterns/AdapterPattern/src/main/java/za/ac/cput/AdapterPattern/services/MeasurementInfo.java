package za.ac.cput.AdapterPattern.services;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public interface MeasurementInfo{
    public double getMetric();
    public double getImperial();
    public void setMetric(double metric);
    public void setImperial(double imperial);
}
