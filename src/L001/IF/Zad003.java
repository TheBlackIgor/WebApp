package IF;

import java.util.Scanner;

public class Zad003 {
    public static void main(String[] args) {
        boolean guessed = false;
        int r = (int)(Math.random() * 10);
        do {
            System.out.println("Zgadnij liczbę:");
            Scanner sc = new Scanner(System.in);
            int a = Integer.parseInt(sc.nextLine());
            if(a < r){
                System.out.println("Więcej\n");
            } else if (a>r) {
                System.out.println("Mniej\n");
            } else if (a==r) {
                System.out.println("Gratulacje, zgadłeś!!!");
                guessed = true;
            }
        }while(!guessed);
    }
}
