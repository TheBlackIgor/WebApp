package L003;

public class Zad009 {
    public static void main(String[] args) {
        Point p1 = new Point(10,10);
        Point p2 = new Point(11,11);
        System.out.println(p1.distanceFromPoint(p2));
    }
}

class Point{
    private int x;
    private int y;

    public Point(){

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double distanceFrom0(){
        double distance = Math.sqrt((Math.pow((x-0),2)+(Math.pow((y-0),2))));
        return distance;
    }
    public double distanceFromCords(int x, int y){
        double distance = Math.sqrt((Math.pow((x-this.x),2)+(Math.pow((y-this.y),2))));
        return distance;
    }
    public double distanceFromPoint(Point p){
        double distance = Math.sqrt((Math.pow((p.getX()-this.x),2)+(Math.pow((p.getY()-this.y),2))));
        return distance;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}