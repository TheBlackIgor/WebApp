package L002;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zad007 {
    public static void main(String[] args) {
        int n = 7;
        System.out.println("podaj x");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());

        int[][] tab = new int[n][n];

        tab[0][0] = 1;
        for(int i = 1; i<n; i++)
        {
            for(int j=0;j<n;j++){
                if(j==0){
                    tab[i][j] = 1;
                }else{
                    tab[i][j]=tab[i-1][j-1] + tab[i-1][j];
                }
            }
        }
        String output = "";
        for(int i = 0; i<n; i++){
            for(int j=(n-i); j>0; j--){
                output += "\t";
            }
            for(int j=0;j<n;j++){
                if(tab[i][j]!=0)
                    output += tab[i][j] + "\t\t";
            }
            output+="\n";
        }
        System.out.println(output);
    }
}
