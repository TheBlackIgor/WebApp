package L003;

import java.math.BigInteger;

public class Zad007 {
    public static void main(String[] args){
        Zegar z1 = new Zegar();
        Zegar z2 = new Zegar();
        System.out.println(z1.equals(z2));
        z1.addMins(90);
        System.out.println(z1.toString());
        z1.substractMins(110);
        System.out.println(z1.toString());
    }
}

class Zegar{
    private int hour;
    private int mins;
    public Zegar(){
        hour = 10;
        mins = 10;
    }
    public void addMins(int m){
        int tm = mins + m;
        hour += tm /60;
        mins = tm%60;
    }
    public void substractMins(int m){
        hour -= m/60;
        mins -= m % 60;
        if(mins < 0){
            mins = 60 + mins;
            hour -= 1;
        }
    }

    @Override
    public String toString() {
        return hour + ":" + mins;
    }

    @Override
    public int hashCode() {
        return (hour*60)+mins;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}
