package IO;

import java.util.Scanner;

public class Zad002 {
    public static void main(String[] args) {
        double x = 0, y=0;
        boolean noError = true;
        do {
            try {
                System.out.println("Program oblicza sumę, różnicę, iloczyn i iloraz\n" +
                        "dla dwóch liczb x i y wprowadzonych z klawiatury.\nPodaj x");
                Scanner sc = new Scanner(System.in);
                x = Double.parseDouble(sc.nextLine());
                sc = new Scanner(System.in);
                System.out.println("Podaj y");
                y = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println ("Nie wczytano liczby lub błędny format. Koniec programu.");
                noError = false;
            }
        }while(noError == false);


        System.out.println("Dla liczb: x = " + x + " i y = " + y);
        System.out.println("Suma = " + (x+y) );
        System.out.println("Różnica = " + (x-y) );
        System.out.println("Iloczyn = " + (x*y) );
        System.out.println("Iloraz = " + (x/y) );
    }
}
