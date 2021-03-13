package dzien4wyjatki;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = sc.nextInt();
        int k = sc.nextInt();
        int[] tablica = new int[10];
        for(int i = 0; i < k; i++) {
            tablica[i] = 10;
        }
        int i = 10;
        System.out.println(i/j);
        System.out.println("Dalej sobie dziala");
    }
}
