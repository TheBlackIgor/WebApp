package L001.ARRAYS;

public class Zad002 {
    public static void main(String[] args) {
        double[] tab = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        double w1 = 0, w2 = 0, w3 = 0;
        for(int i = 0; i<tab.length; i++){
            w1+=tab[i];
            if(i%2 == 0){
                w3+=tab[i];
            }
            if(tab[i]>4.4){
                w2 += tab[i];
            }
        }
        System.out.printf(w1+" "+w2+" "+w3);
    }
}
