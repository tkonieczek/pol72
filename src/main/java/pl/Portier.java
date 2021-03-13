package pl;

public class Portier extends PracownikSzpitala {

    protected String zmiana;

    public Portier() {
    }

    public Portier(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Portier(String imie, String nazwisko, int wiek, double pensja, String zmiana) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.pensja = pensja;
        this.zmiana = zmiana;
    }

    public String getZmiana() {
        return zmiana;
    }

    public void setZmiana(String zmiana) {
        this.zmiana = zmiana;
    }
}
