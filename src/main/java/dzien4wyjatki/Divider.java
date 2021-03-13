package dzien4wyjatki;

public class Divider {

    public static double divide(int a, int b) throws CannotDivideBy0Exception {
        if(b == 0) {
            throw new CannotDivideBy0Exception();
        }
        return  a / (double)b;
    }
}
