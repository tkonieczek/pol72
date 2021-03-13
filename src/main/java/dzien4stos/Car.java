package dzien4stos;

import java.util.Objects;

public class Car {

    private String marka;

    public Car(String marka) {
        this.marka = marka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(marka, car.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marka);
    }
}
