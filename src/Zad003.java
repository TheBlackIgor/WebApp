import java.util.Scanner;

public class Zad003 {
    public static void main(String[] args) {
        do {
            System.out.println("podaj x");
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();
            System.out.println("podano x = " + x);

            if (x.equals("quit")) {
                System.out.println("this is the end");
                break;
            }

            System.out.println("x = " + x);

        } while (true);
    }
}
