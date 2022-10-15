package L003;

import java.math.BigDecimal;
import java.util.Scanner;


public class Zad002 {
    public static void main(String[] args) {
        Pole pole = new Pole();
        //
        pole.read();
        pole.calculate();
        pole.display();
    }
}

class Circle {
    private double PI = 3.141592653589793;
    private double r = 0.0;
    private String color = "none";

    public Circle() {
        this.r = 1.0;
        System.out.println("Radius = "+(this.PI*this.r)+", area = "+this.PI);
    }

    public Circle(double r) {
        this.r = r;
        System.out.println("Radius = "+(this.PI*this.r)+", area = "+this.PI);
    }

    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
        System.out.println("Radius = "+this.r+", area = "+ (this.PI*this.r) +", color = "+this.color);
    }
}
