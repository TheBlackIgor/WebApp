package L003;

import java.math.BigInteger;
import java.util.Scanner;

public class Zad004 {
    public static void main(String[] args) {
        System.out.println("Obliczanie silni dla dowolnej liczby całkowitej.\n" +
                "Podaj n.");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());

        Silnia s = new Silnia(a);
    }
}
class Silnia{
    private BigInteger a = new BigInteger("1");

    public Silnia(int s) {
        for(int i = 1; i<= s;i++){
            BigInteger t = new BigInteger(String.valueOf(i));
            a = a.multiply(t);
            System.out.println("!"+i+" = " + a);
        }
    }


}
