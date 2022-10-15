package L003;

import java.math.BigDecimal;
import java.util.Scanner;


public class Zad001 {
    public static void main(String[] args) {
        Pole pole = new Pole();
        //
        pole.read();
        pole.calculate();
        pole.display();
    }
}

class Pole {
    public static BigDecimal round(double d) {
        BigDecimal bd = new BigDecimal(Double.toString(d));
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);
        return bd;
    }
    private double a = 0.0;
    private double b = 0.0;
    private double pole = 0.0;

    public void read(){
        System.out.println("podaj a:");
        Scanner sc = new Scanner(System.in);
        this.a = Double.parseDouble(sc.nextLine());
        System.out.println("podaj b:");
        sc = new Scanner(System.in);
        this.b = Double.parseDouble(sc.nextLine());
    }
    public void calculate(){
        this.pole = this.a * this.b;
    }

    public void display(){
        System.out.println("Pole prostokąta o boku a = "+round(this.a)+" i boku b = "+round(this.b)+" wynosi "+round(this.pole)+".");
    }
}
