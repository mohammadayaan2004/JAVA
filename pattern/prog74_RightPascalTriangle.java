/*
   *    
  * *   
 *   *  
*     * 
 *   *  
  * *   
   * 
 */
import java.util.Scanner;
public class prog74_RightPascalTriangle {
    public static void nForest(int n) {
        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <=n ; j++)
            {
                if ((i==j)||(i+j==2*n)) {
                    System.out.print("*");// PRINT
                } else {
                    System.out.print(" ");// SPACE
                }
            } 
            System.out.println(" ");
        }
    }    
    public static void main(String[] args) {
        System.out.print("Number of rows :- ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        nForest(n);
        sc.close();
    }
}
