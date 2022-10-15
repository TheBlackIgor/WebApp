package L001.LOOPS;

public class Zad007 {
    public static void main(String[] args) {
        System.out.println("Program wyświetla duże litery alfabetu od A do Z i od Z do A.");
        char l = 'A';
        while(true) {
            System.out.print(l + (l == 'Z' ? ".\n" : ", "));
            if(l=='Z'){
                break;
            }
            l++;
        }
        while(true) {
            System.out.print(l + (l == 'A' ? ".\n" : ", "));
            if(l=='A'){
                break;
            }
            l--;
        }
    }
}
