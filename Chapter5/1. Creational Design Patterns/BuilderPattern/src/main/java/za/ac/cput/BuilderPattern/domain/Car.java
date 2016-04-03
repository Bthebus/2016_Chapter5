package za.ac.cput.BuilderPattern.domain;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-26
 */
public class Car{
    private String engine;
    private String wheels;
    private String body;
    private String suspension;

    public Car() {
    }

    public Car(String engine, String wheels, String body, String suspension) {
        this.engine = engine;
        this.wheels = wheels;
        this.body = body;
        this.suspension = suspension;
    }

    public String getEngine() {
        return this.engine;
    }

    public String getWheels() {
        return this.wheels;
    }

    public String getBody() {
        return this.body;
    }

    public String getSuspension() {
        return this.suspension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (body != null ? !body.equals(car.body) : car.body != null) return false;
        if (engine != null ? !engine.equals(car.engine) : car.engine != null) return false;
        if (suspension != null ? !suspension.equals(car.suspension) : car.suspension != null) return false;
        if (wheels != null ? !wheels.equals(car.wheels) : car.wheels != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = engine != null ? engine.hashCode() : 0;
        result = 31 * result + (wheels != null ? wheels.hashCode() : 0);
        result = 31 * result + (body != null ? body.hashCode() : 0);
        result = 31 * result + (suspension != null ? suspension.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", body='" + body + '\'' +
                ", suspension='" + suspension + '\'' +
                '}';
    }

}
