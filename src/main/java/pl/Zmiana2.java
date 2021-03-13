package pl;

import java.util.Objects;

public class Zmiana2 {
    //DZIENNA, POPIUDNIOWA, NOCNA
    String value;
    public static final String DZIENNA = "DZIENNA";
    public static final String POPOLUDNIOWA = "POPOLUDNIOWA";
    public static final String NOCNA = "NOCNA";
    public Zmiana2() {
    }

    public Zmiana2(String value) {
        if(value.equals(DZIENNA) ||
                value.equals(POPOLUDNIOWA) ||
                value.equals(NOCNA)) {
            this.value = value;
        }
    }

    public void setValue(String value) {
        if(value.equals(DZIENNA) ||
                value.equals(POPOLUDNIOWA) ||
                value.equals(NOCNA)) {
            this.value = value;
        }
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zmiana2 zmiana2 = (Zmiana2) o;
        return Objects.equals(value, zmiana2.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
