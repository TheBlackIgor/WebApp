package L001.LOOPS;

public class Zad008 {
    public static void main(String[] args) {
        int[] tablica1 = {2,5,43,11,23,78,333,765,67,67,67,111,123};
        int sum = 0;
        for (int value : tablica1) {
            sum += value;
        }
        System.out.println("wynik = " + sum);
    }
}
