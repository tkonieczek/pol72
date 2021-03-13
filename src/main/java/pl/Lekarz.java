package pl;

//dziedziczyc mozemy tylko po 1 klasie
public class Lekarz extends PracownikSzpitala {


    //dziedziczone sa pola ktore sa
    // public, protected
    // domyślny (default) jest dziedziczone ale tylko jesli
    // obie klasy znajduja sie w tym samy pakcie
    // private nie jest dzedziczone
    protected String specjalizacja;
    protected double premia;

    public Lekarz() {
        System.out.println("Jestem konstruktorem lekarza");
    }

    public Lekarz(String imie, String nazwisko) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Lekarz(String imie, String nazwisko, int wiek, double pensja, String specjalizacja, double premia) {
       // super(imie, nazwisko, wiek, pensja);
        this(imie, nazwisko);
        this.specjalizacja = specjalizacja;
        this.premia = premia;
    }

    // metodzy dziedziczone sa tak samo jak pola
    // w sensie public protected itd.
    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }

    private void wykonajZabieg(String idPacjenta) {
        System.out.println("Robie operacje pacjetowi " + idPacjenta);
    }

}
