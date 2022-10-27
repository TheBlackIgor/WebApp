package L001.ARRAYS;

import java.util.Arrays;

public class Zad003 {
    public static void main(String[] args) {
        int l = 0;
        int[] tab = {0,1,2,3,4,5,5,5,5,5,3,4,5};
        int[] tab1 = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            l++;
            for(int j = 0; j < i; j++){
                if(tab1[j] == tab[i]){
                    l--;
                    break;
                }
            }
            tab1[i] = tab[i];
        }
        System.out.println(l);
        int[] tab2 = new int[l];
        int p = -1;
        for(int i = 0; i<tab.length; i++){
            p++;
            boolean repeat = false;
            for(int j = 0; j < p; j++){
                if(tab2[j] == tab[i]){
                    repeat = true;
                    p--;
                    break;
                }
            }
            if(repeat == false)
                tab2[p] = tab[i];
        }
        System.out.println(Arrays.toString(tab2));
    }
}
