package pl;

public class Pielegniarka extends PracownikSzpitala {

    protected String tytul;
    protected int nadgodziny;

    public Pielegniarka() {
    }

    public Pielegniarka(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Pielegniarka(String imie, String nazwisko, String tytul, int wiek, double pensja, int nadgodziny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tytul = tytul;
        this.wiek = wiek;
        this.pensja = pensja;
        this.nadgodziny = nadgodziny;

    }



    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public int getNadgodziny() {
        return nadgodziny;
    }

    public void setNadgodziny(int nadgodziny) {
        this.nadgodziny = nadgodziny;
    }


}
