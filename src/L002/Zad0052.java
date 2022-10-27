package L002;

import java.util.Scanner;

public class Zad0052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        diament(word.charAt(0));
    }
    static void diament(char s){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int size = (alphabet.indexOf(s) * 2) + 1;
        char letter = 'a';
        int span = alphabet.indexOf(s);
        boolean plus = true;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if((j==size-1-span)  || (j==span)){
                    System.out.print(letter);

                }else{
                    System.out.print(".");
                }
            }
            if(span==size-1){
                plus=false;
            };
            if(plus){
                span+=1;
                letter++;
            }else{
                span-=1;
                letter--;
            }
            System.out.println();
        }
    }
}