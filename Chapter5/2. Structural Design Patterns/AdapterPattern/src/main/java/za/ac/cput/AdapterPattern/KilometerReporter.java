package za.ac.cput.AdapterPattern;

/**
 * Author       : Braedy Thebus (213039168)
 * Email        : Bthebus2@gmail.com
 * Date Created : 2016-03-29
 */
public class KilometerReporter {

    private double kilometre;

    public KilometerReporter() {
    }

    public KilometerReporter(double kilometre) {
        this.kilometre = kilometre;
    }

    public double getKilometre() {
        return kilometre;
    }

    public void setKilometre(double kilometre) {
        this.kilometre = kilometre;
    }

    @Override
    public String toString() {
        return "KilometerReporter{" +
                "kilometre=" + kilometre +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KilometerReporter that = (KilometerReporter) o;

        if (Double.compare(that.kilometre, kilometre) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(kilometre);
        return (int) (temp ^ (temp >>> 32));
    }
}
