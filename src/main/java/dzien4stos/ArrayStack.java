package dzien4stos;

public class ArrayStack implements Stack {

    private static final int buffor = 100;
    public int elementCount = 0;

    String[] data;

    public ArrayStack() {
        data = new String[buffor];
    }

    // 1. zapelnia do buffot
    // 2. jeli buffor jest full to
    //  a) tworze tymczasowa tablice np. 2xbuffor
    //  b) przepisuje z obecnej tablicy od nowej
    //  c) data = newData (2 x wieksza)
    @Override
    public void push(String newElement) throws Exception {
        if(elementCount >= buffor) {
            throw new Exception("Full stack exception");
        }
        data[elementCount] = newElement;
        elementCount++;
    }

    @Override
    public String pop() throws  Exception{
        if(elementCount == 0) {
            throw new Exception("Nie ma nic na stosie");
        }
        String temp = data[elementCount - 1];
        data[elementCount - 1] = null;
        return temp;

    }

    @Override
    public String peek() throws Exception{
        if(elementCount == 0) {
            throw new Exception("Nie ma nic na stosie");
        }
        return data[elementCount - 1];
    }

    @Override
    public boolean isEmpty() {
        return elementCount == 0;
    }
}
