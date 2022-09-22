package LOOPS;

import java.util.Scanner;

public class Zad004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj liczbę a program wypiszę Ci sumę liczb całkowitych do tej liczby.");
        int x1 = 0, x2 = 0;
        int w1 = 0, w2 = 0, w3 = 0;
        do{
            x1++;
            w1 += x1;
        }while(x1!=a);
        System.out.println("Suma liczb całkowitych od 1 do "+a+" wynosi " + w1 + "(do while)");
        while(x2 != a){
            x2++;
            w2 += x2;
        }
        System.out.println("Suma liczb całkowitych od 1 do "+a+" wynosi " + w2 + "(while)");
        for (int i = 1;i<=a;i++){
            w3 += i;
        }
        System.out.println("Suma liczb całkowitych od 1 do "+a+" wynosi " + w3 + "(for)");
    }
}
