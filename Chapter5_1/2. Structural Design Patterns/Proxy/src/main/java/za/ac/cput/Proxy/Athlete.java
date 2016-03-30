package za.ac.cput.Proxy;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-30
 */
public class Athlete {

    private String name;
    private String surname;
    private double topSpeed;

    public Athlete() {
    }

    public Athlete(String name, String surname, double topSpeed) {
        this.name = name;
        this.surname = surname;
        this.topSpeed = topSpeed;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Athlete athlete = (Athlete) o;

        if (Double.compare(athlete.topSpeed, topSpeed) != 0) return false;
        if (name != null ? !name.equals(athlete.name) : athlete.name != null) return false;
        if (surname != null ? !surname.equals(athlete.surname) : athlete.surname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        temp = Double.doubleToLongBits(topSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
