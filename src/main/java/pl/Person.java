package pl;

import java.util.Objects;

public class Person extends Object {

    // naruszenie enkapsulacji to np. wyszskie albo czesc pol ustawione public

    private String name;
    private int waga;
    private int wzrost;
    private double bmi;

    public Person(String name, int waga, int wzrost) {
        this.name = name;
        this.waga = waga;
        this.wzrost = wzrost;
    }

    public double obliczBmi() {
        double obliczoneBmi = waga / Math.pow(wzrost,2);
        return obliczoneBmi;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return waga == person.waga && wzrost == person.wzrost && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, waga, wzrost);
    }
}
