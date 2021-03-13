package pl.sda.gra;

public class Lucznik implements Postac {

    Luk luk = new Luk();

    @Override
    public int atak() {
        System.out.println("Atakuje lukiem");
        return luk.getObrazeniaKlute();
    }

    @Override
    public void obrona() {

    }
}
