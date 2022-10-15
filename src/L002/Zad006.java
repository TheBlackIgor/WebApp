package L002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zad006 {
    public static void main(String[] args) {
        String s = "";
        System.out.println("SCRABLE\nPodaj słowo:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.println(missingCharacters(s));
    }

    static String missingCharacters(String s){
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String alphToReturn = "";
        s = s.toLowerCase();
        for(int i = 0; i < alph.length(); i++){
            if(!s.contains(String.valueOf(alph.charAt(i)))){
                alphToReturn = alphToReturn + String.valueOf(alph.charAt(i));
            }
        }
        return alphToReturn;
    }
}
