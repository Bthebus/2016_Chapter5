package za.ac.cput.BuilderPattern.services;

import za.ac.cput.BuilderPattern.domain.Car;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public interface CarBuilder {
    public String buildEngine();
    public String buildWheels();
    public String buildBody();
    public String buildSuspension();

    public Car getCar();
}
