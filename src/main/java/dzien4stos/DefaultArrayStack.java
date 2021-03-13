package dzien4stos;

public class DefaultArrayStack<T> {

    private static final int buffor = 100;
    public int elementCount = 0;
    T[] data;

    public DefaultArrayStack() {

         data = (T[])(new Object[buffor]);
        //  data = new Object[10];
    }
    public void push(T newElement) throws Exception {
        if(elementCount >= buffor) {
            throw new Exception("Full stack exception");
        }
        data[elementCount] = newElement;
        elementCount++;
    }
    public T pop() throws  Exception{
        if(elementCount == 0) {
            throw new Exception("Nie ma nic na stosie");
        }
        T temp = data[elementCount - 1];
        data[elementCount - 1] = null;
        elementCount--;
        return temp;
    }
    public T peek() throws Exception{
        if(elementCount == 0) {
            throw new Exception("Nie ma nic na stosie");
        }
        return data[elementCount - 1];
    }
    public boolean isEmpty() {
        return elementCount == 0;
    }
}
