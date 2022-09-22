package L001.LOOPS;

public class Zad006 {
    public static void main(String[] args) {
        System.out.println("Tabliczka mnożenia");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <=10; j++){
                System.out.print((i*j) + (j==10?"\n":"\t"));
            }
        }
    }
}
