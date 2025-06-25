/*
 * * * *
  *   *   
   * *     
    *
   * *
  *   *
 * * * *  
 */

import java.util.Scanner;
public class prog72_HollowHourGlassPyramid {
    public static void nForest(int n) {
        //UPPER HALF
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if ((i == 1 && j % 2 == 1) || i == j || i + j == 2 * n) {
                    System.out.print("*");// PRINT
                } else {
                    System.out.print(" ");// SPACE
                }
            }
            System.out.println(" ");
        }
        //LOWER HALF
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) 
            {
                if ((i == n && j % 2 == 1) ||i + j == n + 1 || j - i == n - 1 ) {
                    System.out.print("*");//PRINT
                } else {
                    System.out.print(" ");//SPACE
                }
            }
            System.out.println(" ");
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
