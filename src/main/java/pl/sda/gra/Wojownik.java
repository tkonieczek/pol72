package pl.sda.gra;

public class Wojownik implements Postac {

    private Miecz miecz = new Miecz();

    @Override
    public int atak() {
        System.out.println("Atakuje mieczem");
        return miecz.getObrazeniaSieczne();
    }

    @Override
    public void obrona() {
        System.out.println("Bronie sie cos cos tam");
    }
}
