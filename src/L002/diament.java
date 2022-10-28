package L002;

import java.util.ArrayList;

public class diament {
    public static void main(String[] args) {
        diament('z');
    }

    public static void diament(char c){
        ArrayList<String> list = new ArrayList<>();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int size = (alphabet.indexOf(c) * 2) + 1;
        char letter = 'a';
        int span = alphabet.indexOf(c);
        boolean plus = true;
        for(int i = 0; i<size;i++){
            String s = "";
            for(int j=0;j<size;j++){
                if((j==size-1-span)||(j==span)){
                    s += letter;
                }else{
                    s += ".";
                }
            }
            if(span==size-1){
                plus=false;
            }
            if(plus==true){
                span++;
                letter++;
            }else{
                span--;
                letter--;
            }
            System.out.println(span +" _ "+size);
            list.add(s);
        }
        String output = "";
        for(String el : list){
            output+=el+"\n";
        }
        System.out.println(output);
    }
}
