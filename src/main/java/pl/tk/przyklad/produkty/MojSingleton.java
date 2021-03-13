package pl.tk.przyklad.produkty;

public class MojSingleton {

    private static MojSingleton INSTANCE;

    private MojSingleton() {
    }

    public static MojSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MojSingleton();
        }
        return INSTANCE;
    }
}
