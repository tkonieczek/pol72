package dzien4;

public class Citizen {

    private String name;
    private String surname;
    private long pesel;
    private Sex sex;

    public Citizen(String name, String surname, long pesel, Sex sex) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this. sex = sex;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pesel=" + pesel +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getPesel() {
        return pesel;
    }

    public Sex getSex() {
        return sex;
    }
}
