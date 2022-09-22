package L001.LOOPS;

import java.util.Scanner;

public class Zad005 {
    public static void main(String[] args) {
        System.out.println("Podaj rozmiar tablicy: ");
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int[] tab = new int[a];
        int max = 0, min = 100, s = 0;
        String numbers = "";
        for ( int i = 0; i<a;i++){
            int x = (int)(Math.random() * 100);
            tab[i] = x;
            if(x > max){
                max = x;
            }
            if(min > x){
                min = x;
            }
            s += x;
            numbers = numbers +  String.valueOf(x) + (i!=a-1 ? ", ":".\n");
        }
        double s1 = (double)s, a1 = (double)a;
        System.out.println("Numbers: "+numbers+"\nMax: "+max+"\nMin: "+min+"\nAvg: "+ s1/a1);

    }
}
