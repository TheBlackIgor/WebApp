package IO;

import java.math.BigDecimal;
import java.util.Scanner;

public class Zad001 {
    public static BigDecimal round(double d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
    public static void main(String[] args) {
        double r = 0;
        boolean noError = true;
        do {
            try {
                noError = true;
                System.out.println("Program oblicz objętość kuli\nPodaj jej promień: ");
                Scanner sc = new Scanner(System.in);
                r = Double.parseDouble(sc.nextLine());

            } catch (NumberFormatException e) {
                System.out.println ("Nie wczytano liczby lub błędny format. Koniec programu.");
                noError = false;
            }
        }while(noError == false);



        double ob = 4.0 / 3.0 * Math.PI * Math.pow(r, 3);
        System.out.println("Objętość kuli o promieniu r = " + r +" wynosi " + round(ob,2));
    }

}
