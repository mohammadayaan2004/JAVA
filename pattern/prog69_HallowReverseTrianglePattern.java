/*
* * * * * 
 *     *
  *   *   
   * *   
    *     
 */
import java.util.Scanner;
public class prog69_HallowReverseTrianglePattern {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) 
            {
                if (i==j || (i==1 && j%2==1) || i+j == 2*n ) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
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

