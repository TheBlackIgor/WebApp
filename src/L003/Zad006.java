package L003;

public class Zad006 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println(robot.getName());
        for (int i = 0; i < 10; i++) {
            robot.reset();
            System.out.println(robot.getName());
        }
    }
}

class  Robot {
    private String name = "";

    public Robot() {
        this.name = createName();
    }

    private String createName() {
        String newName = "";
        newName += String.valueOf((char)getRandomNumber(65, 90));
        newName += String.valueOf((char)getRandomNumber(65, 90));
        newName += "-";
        newName += String.valueOf(getRandomNumber(100, 999));
        return newName;
    }
    public void reset(){
        this.name = createName();
    }
    public String getName() {
        return name;
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

}