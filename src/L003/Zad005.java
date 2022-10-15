package L003;

import java.util.Scanner;

public class Zad005 {
    public static void main(String[] args) {
        Osoba o = new Osoba();
        o.init();
    }
}

class Osoba{
    private String name = "";
    private String surname = "";
    private String postcode = "";

    public void init(){
        System.out.println("Wprowadzanie danych\n" +
                "Podaj imię:");
        Scanner sc = new Scanner(System.in);
        this.name = sc.nextLine();
        System.out.println("Podaj nazwisko: ");
        sc = new Scanner(System.in);
        this.surname = sc.nextLine();
        System.out.println("Podaj kod pocztowy: ");
        sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean postCodeValidation = check(s);
        while(!postCodeValidation){
            System.out.println("podaj dokładnie sześć cyfr kodu i kreskę na trzecim miejscu");
            sc = new Scanner(System.in);
            s = sc.nextLine();
            postCodeValidation = check(s);
        }
        this.postcode = s;
        display();
    }
    public void display(){
        System.out.println("=======================\n" +
                "Wyświetlenie danych\n" +
                "Nazwisko: "+this.name+"\n" +
                "Miasto: "+this.surname+"\n" +
                "Kod: "+this.postcode);
    }
    private boolean check(String p){
        if(p.length() != 6){
            return false;
        }
        for(int i = 0; i < 6; i++){
            if(p.charAt(i) != '-' && i == 2){
                System.out.println("atesdas");
                return false;
            }else if(!('9' - p.charAt(i) >= 0 && '9' - p.charAt(i) <= 9) && i!=2){
                return false;
            }
        }
        return true;
    }
}