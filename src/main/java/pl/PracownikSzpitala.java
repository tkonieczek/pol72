package pl;

public class PracownikSzpitala {

    public static String[] zmiany = new String[3];

    // Przykald uzycia bloku statycznego
    // Blok statyczny jest uzywany do wyiczenia wartosci zmiennych statycznych
/*    static {
        zmiany[0] = "DZIENNA";
        zmiany[1] = "POPOLUDNIOWA";
        zmiany[2] = "NOCNA";
    }*/

    protected String imie;
    protected String nazwisko;
    protected int wiek;
    protected double pensja;
    protected Zmiana zmiana;


    public PracownikSzpitala(String imie, String nazwisko, int wiek, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
    }

    public PracownikSzpitala() {
        zmiana = Zmiana.NOCNA;
        System.out.println("Jestem konstruktorem pracownika szpitala");
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }


}
