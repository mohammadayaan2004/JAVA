/*
https://www.naukri.com/code360/problems/alpha-hill_6581921
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/
import java.util.Scanner;
public class prog98_AlphaHill {
    public static void nForest(int n)
    {
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            char k='A';
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print(k);
                if(j<i){k++;}
                else {k--;}
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Number of rows :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }
}
