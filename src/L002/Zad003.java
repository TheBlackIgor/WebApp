package L002;

import java.util.ArrayList;
import java.util.Scanner;

public class Zad003 {
    public static void main(String[] args) {
        String s = "";
        System.out.println("ODWRACANIE STRINGA\nPodaj słowo:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        s = rev(s);
        System.out.println(s);
        s = rev(s);
        System.out.println(s);
    }

    static String rev(String str){
        String s = "";
        ArrayList<String> tab = new ArrayList<>();
        for(int i = str.length()-1; i>=0;i--){
            tab.add(String.valueOf(str.charAt(i)));
        }
        s = String.join("",tab);
        return s;
    }
}
