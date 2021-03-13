package dzien4;

import pl.PracownikSzpitala;

public class Pair<T extends PracownikSzpitala, V> {

    T first;
    V second;

    public Pair(T fist, V second) {
        this.first.setImie("Zdzichu");
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }
}
