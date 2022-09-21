package IF;

import java.util.Scanner;

public class Zad001 {
    public static void main(String[] args) {
        double a = 0, b=0, c=0;
        boolean noError = true;
        do {
            try {
                System.out.println("Program oblicza sumę, różnicę, iloczyn i iloraz\n" +
                        "dla dwóch liczb x i y wprowadzonych z klawiatury.\nPodaj a");
                Scanner sc = new Scanner(System.in);
                a = Double.parseDouble(sc.nextLine());
                System.out.println("Podaj b");
                b = Double.parseDouble(sc.nextLine());
                System.out.println("Podaj c");
                c = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println ("Nie wczytano liczby lub błędny format. Koniec programu.");
                noError = false;
            }
            boolean triangleExists = false;
            if(
                Math.pow(a,2) + Math.pow(b,2) == Math.pow(c,2) ||
                Math.pow(a,2) + Math.pow(c,2) == Math.pow(b,2) ||
                Math.pow(c,2) + Math.pow(b,2) == Math.pow(a,2)
            ){
                triangleExists = true;
            }

            if(triangleExists){
                System.out.println ("Trójkąt jest prostokątny");
            }else{
                System.out.println ("Trójkąt nie jest prostokątny");
            }
        }while(noError == false);
    }
}
