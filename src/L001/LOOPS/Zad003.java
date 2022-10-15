package L001.LOOPS;

public class Zad003 {
    public static void main(String[] args) {
        int w1 = 0, w2 = 0;
        for (int i = 0; i <=100; i++){
            if(i%2==0){
                w1 += i;
            }else{
                w2 += i;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do 100 wynosi "+w1+".\n" +
                "Suma liczb nieparzystych od 1 do 100 wynosi "+w2+".");
    }
}
