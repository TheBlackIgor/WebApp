package IF;

import java.math.BigDecimal;
import java.util.Scanner;

public class Zad002 {
    public static BigDecimal round(double d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
    public static void main(String[] args) {
        double a = 0, b=0, c=0;
        boolean noError = true;
        do {
            noError = true;
            try {
                System.out.println("Program oblicza sumę, różnicę, iloczyn i iloraz\n" +
                        "dla dwóch liczb x i y wprowadzonych z klawiatury.\nPodaj a");
                Scanner sc = new Scanner(System.in);
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Podaj b");
                b = Double.parseDouble(sc.nextLine());
                System.out.println("Podaj c");
                c = Double.parseDouble(sc.nextLine());
                if(a==0){
                    System.out.println("a nie może być równe 0\nWprowadź dane jeszcze raz\n");
                    noError = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Nie wczytano liczby lub błędny format. Koniec programu.");
                noError = false;
            }
        }while(noError == false);
        double x = (c-b) / a;
        System.out.println("Dla:\na="+round(a,2)+"\nb="+round(b,2)+"\nc="+round(c,2)+"\nx jest równe "+round(x,2));
    }
}
