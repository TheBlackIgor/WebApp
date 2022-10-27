package L001.ARRAYS;

public class Zad001 {
    public static void main(String[] args) {
        int[] tab = {2,5,43,11,23,78,333,765,67,67,67,111,123};
        int w = 0;
        for(int i = 0; i< tab.length; i++){
            w += tab[i];
        }
        System.out.println("Wynik to: " + w);
    }
}
