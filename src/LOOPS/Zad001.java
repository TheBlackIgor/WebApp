package LOOPS;

public class Zad001 {
    public static void main(String[] args) {
        System.out.println("Liczby 1-20");
        int x1 = 0, x2 = 0;
        do{
            x1++;
            System.out.print(x1+(x1!=20?",":".\n"));
        }while(x1!=20);
        while(x2 != 20){
            x2++;
            System.out.print(x2+(x2!=20?",":".\n"));
        }
        for (int i = 1;i<=20;i++){
            System.out.print(i+(i!=20?",":".\n"));
        }
    }
}
