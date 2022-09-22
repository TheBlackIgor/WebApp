package LOOPS;

public class Zad002 {
    public static void main(String[] args) {
        System.out.println("Program sumuje liczby całkowite od 1 do 100.");
        int x1 = 0, x2 = 0;
        int w1 = 0, w2 = 0, w3 = 0;
        do{
            x1++;
            w1 += x1;
        }while(x1!=100);
        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + w1 + "(do while)");
        while(x2 != 100){
            x2++;
            w2 += x2;
        }
        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + w2 + "(while)");
        for (int i = 1;i<=100;i++){
            w3 += i;
        }
        System.out.println("Suma liczb całkowitych od 1 do 100 wynosi " + w3 + "(for)");
    }
}
