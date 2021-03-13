package pl.sda.gra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Wojownik p1 = new Wojownik();
        Wojownik p2 = new Wojownik();
        Lucznik p3 = new Lucznik();
        List<Postac> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        KrasnoludWojownik kw = new KrasnoludWojownik();
        KrasnoludWojownikAdapter krA = new KrasnoludWojownikAdapter(kw);
        lista.add(krA);
        for (Postac postac : lista) {
            postac.atak();
        }
    }
}
