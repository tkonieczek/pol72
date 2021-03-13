package dzien4stos;

public interface Stack {


    // poprawić wyjatki
    void push(String newElement) throws Exception; // tu zrobic swoje wyjatki tak jak robicie
    String pop() throws Exception;
    String peek() throws Exception;
    boolean isEmpty();
}
