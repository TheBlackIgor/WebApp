package L002;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad004 {
    public static void main(String[] args) {
        String s = "";
        System.out.println("SCRABLE\nPodaj słowo:");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        scarble(s);
    }

    static void scarble(String str){
        int x = 0;
        for(int i = 0; i<str.length();i++){
            x += ptk(str.charAt(i));
        }
        System.out.println("Słowo "+ str+ " daje Ci " + x +"ptk");
    }


    static Integer ptk(char c){
        int w = 0;
        Map<Integer, String> map = new HashMap<>(){
            {
                put(1, "aeioulnrst");
                put(2, "dg");
                put(3, "bcmp");
                put(4, "fhvwy");
                put(5, "k");
                put(8, "jx");
                put(10, "qz");
            }
        };
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getValue().contains(String.valueOf(c))){
                w = entry.getKey();
            }
        }
        return w;
    }
}
