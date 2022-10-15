package L001.LOOPS;

public class Zad009 {
    public static void main(String[] args) {
        double[] tab = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        double s1 = 0, s2 = 0, s3 = 0;
        for (int i = 0; i < tab.length; i++){
            s1 += tab[i];
            if(tab[i] > 4.4){
                s2 += tab[i];
            }
            if(i%2==0){
                s3+=tab[i];
            }
        }
        System.out.printf(s1 +", "+ s2 +", "+ s3);
    }
}
