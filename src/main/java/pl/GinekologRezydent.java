package pl;

// Po naszej klasie moga dziedziczyc kolejne klasy
public class GinekologRezydent extends Lekarz {

    // Obiekt musi miec konstruktor
    // Jesli go nie stworzymy do Java przy kompilacij
    // sama sobie stworzy pusty konstruktor
    public GinekologRezydent() {
        System.out.println("Jestem konstruktorem Ginekologa rezydenta");
    }

    //Jesli stworzymy jakikolwiek konstruktor
    // to java nie stworzy pustego domyslego
    public GinekologRezydent(String imie) {
        this.imie = imie;
    }

}
