package L002;

import java.util.ArrayList;

public class Zad005 {
    public static void main(String[] args) {
         System.out.println(printDiament('Z'));
    }
    static String printDiament(char c){
        ArrayList<String> tab = new ArrayList<>();
        String d = "";
        int lk = c - 'A', l = (c-'A')*2+1;
        char z = 'A';
        int m = c-'A';
        boolean r = true;
        if(c == 'A'){
            d = "A";
        }else{
            for(int i = 0; i < l; i++){
                for(int j = 0; j<l;j++){
                    if(j==c-z || j==l-(c-z)-1){
                        tab.add(String.valueOf(z));
                    }else{
                        tab.add(".");
                    }
                }
                if(z==c){
                    r = false;
                }
                if(r){
                    z++;
                }else{
                    z--;
                }
                d += String.join("",tab);
                d+="\n";
                tab.clear();
            }
        }

        return d;
    }
}
