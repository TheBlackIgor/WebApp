import java.util.*;

public class test {

    static String formatSth(String... args){
        return Arrays.toString(args);
    }
    static String[] formatSth2(String... args){
        return args;
    }

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
        System.out.println(formatSth("a","b","c","d"));
        System.out.println(Arrays.toString(formatSth2("d","e","f")));

        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("a");
        set1.add("a");

        System.out.println(set1);

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 100);
        map.put("b", 200);
        map.put("c", 300);
        map.put("d", 400);
        map.put("a", 200);

        System.out.println(map);
        System.out.println(map.get("a"));
        Map<String, Integer> map1 = new HashMap<>(){
            {
                put("a", 100);
                put("b", 200);
                put("c", 300);
            }
        };


        for (String key : map1.keySet()) {
            System.out.println(key + ":" + map1.get(key));
        }
        for (Integer value : map1.values()) {
            System.out.println(value);
        }
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

}
