package dzien4;

public class MinMax<T extends Comparable> {

    private T first;
    private T second;

    public MinMax(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getMin() {
        return (first.compareTo(second) < 0 ? first : second);
    }

    public T getMax() {
        return (first.compareTo(second) > 0 ? second : first);
    }
}
