package IF;

import java.util.Scanner;

public class Zad001 {
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
    }
}
