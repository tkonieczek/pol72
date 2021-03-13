package pl.sda.gra;

public class KrasnoludWojownikAdapter implements Postac {

    KrasnoludWojownik krasnoludWojownik;

    public KrasnoludWojownikAdapter(KrasnoludWojownik kr ) {
        this.krasnoludWojownik = kr;
    }

    @Override
    public int atak() {
        return (int) krasnoludWojownik.uderzToporem();
    }

    @Override
    public void obrona() {
        krasnoludWojownik.bronSieTarcza();
    }
}
