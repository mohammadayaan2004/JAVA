/*
*    
 *   
* *  
 * * 
* *  
 *   
* 
 */
import java.util.Scanner;
public class prog74_RightPascalTriangle {
    public static void nForest(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++)
            {
                if ((i%2==0 && j%2==0)||(i%2==1 && j%2==1)) {
                    System.out.print("*");// PRINT
                } else {
                    System.out.print(" ");// SPACE
                }
            } 
            System.out.println(" ");
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=i; j++)
            {
                if ((i%2==0 && j%2==0)||(i%2==1 && j%2==1)) {
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
