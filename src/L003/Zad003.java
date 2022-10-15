package L003;

import java.math.BigDecimal;
import java.util.Scanner;


public class Zad003 {
    public static void main(String[] args) {
        Circle1 c = new Circle1(3.0, "blue");
        System.out.println(c.toString());
        c.setColor("red");
        System.out.println(c.toString());
    }
}

class Circle1 {
    private double PI = 3.141592653589793;
    private double r = 0.0;
    private String color = "none";

    public Circle1() {
        this.r = 1.0;
        System.out.println("Radius = "+this.r+", area = "+(this.PI* Math.pow(this.r,2)));
    }

    public Circle1(double r) {
        this.r = r;
        System.out.println("Radius = "+this.r+", area = "+(this.PI* Math.pow(this.r,2)));
    }

    public Circle1(double r, String color) {
        this.r = r;
        this.color = color;
        System.out.println("Radius = "+this.r+", area = "+ (this.PI* Math.pow(this.r,2)) +", color = "+this.color);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void countParameter(){
        System.out.println("area = "+(this.PI* Math.pow(this.r,2))+"\n" +
                "circumstance = "+(2*this.PI*this.r));
    }

    @Override
    public String toString() {
        return "Circle1{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}
