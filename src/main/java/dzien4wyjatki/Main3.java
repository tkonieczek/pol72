package dzien4wyjatki;

public class Main3 {

    public static void main(String[] args) {
        try {
            double divide = Divider.divide(10, 0);
            System.out.println(divide);
        } catch (CannotDivideBy0Exception e) {
            e.printStackTrace();
        }
    }
}
