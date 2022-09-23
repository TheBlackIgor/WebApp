package L002;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad002 {
    public static void main(String[] args) {
        int n = 0, s = 0;
        System.out.println("SUMOWANIE\nPodaj n:");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> tab = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            tab.add(i);
            s += i;
        }
        System.out.println("Wszystkie elementy: \n" + tab+"\nSuma = "+s);
    }
}
