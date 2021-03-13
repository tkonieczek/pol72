package pl;

public enum Zmiana {
    DZIENNA(7, 15),
    POPOLUDNIWA(15, 23),
    NOCNA(23, 7);

    private int godzinaOd;
    private int godzinaDo;

    Zmiana(int godzinaOd, int godzinaDo) {
        this.godzinaOd = godzinaOd;
        this.godzinaDo = godzinaDo;
    }

    public int getGodzinaOd() {
        return godzinaOd;
    }

    public int getGodzinaDo() {
        return godzinaDo;
    }
}
