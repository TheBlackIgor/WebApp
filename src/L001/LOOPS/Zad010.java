package L001.LOOPS;

public class Zad010 {
    public static void main(String[] args) {
        String[] tab = {"koty","psy","owoce","grzyby","samochody","kanarki"};
        String s1 ="", s4 ="", s5="";
        int s2=0,s3=0;
        for(int i = 0; i< tab.length; i++){
            char l = tab[i].charAt(0);
            if(l == 'k'){
                s1 = s1 + tab[i]+", ";
                s2++;
            }
            if(tab[i].length() > 4){
                s3++;
                s4 = s4 + tab[i]+", ";
            }
            if(tab[i].length() > 5){
                s5 = s5 + tab[i]+", ";
            }
        }
        System.out.println(s1+"\n" + s2+"\n"+s3+"\n"+s4 +"\n"+s5);
    }
}
