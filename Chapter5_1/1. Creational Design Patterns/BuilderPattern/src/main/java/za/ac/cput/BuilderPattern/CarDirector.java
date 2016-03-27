package za.ac.cput.BuilderPattern;

import za.ac.cput.BuilderPattern.domain.Car;
import za.ac.cput.BuilderPattern.services.CarBuilder;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class CarDirector {
    private CarBuilder carBuilder = null;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void constructCar(){
        carBuilder.buildEngine();
        carBuilder.buildSuspension();
        carBuilder.buildWheels();
        carBuilder.buildBody();
    }

    public Car getCar()
    {
        return carBuilder.getCar();
    }
}
