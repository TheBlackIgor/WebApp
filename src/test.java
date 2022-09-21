import java.util.Arrays;

public class test {

    public static void main(String[] args) {
        System.out.println("zad1");
        int a = Integer.parseInt("123");
//        int b = Integer.parseInt("www"); // błąd
        float c = Float.parseFloat("123");
        double d = Double.parseDouble("123");
        boolean e = Boolean.parseBoolean("false");
        boolean f = Boolean.parseBoolean("aaa");
        String g = String.valueOf(true);
        String h = String.valueOf(456);
        String i = String.valueOf(12.34);
        String j  = String.valueOf(2 > 1);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("bye");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4));
//        String[] arr03 = new String[3];
//        System.out.println(Arrays.toString(arr03));
//        arr03[0] = "test";
//        System.out.println(arr03[0]);
//        String[] strings = new String[3];
//        Arrays.fill(strings, "x");
//        System.out.println(Arrays.toString(strings));
    }

}
