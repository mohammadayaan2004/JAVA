/*/
*      *
**    **
***  ***
********
***  ***
**    **
*      *   
/*/
import java.util.Scanner;
public class prog79_ButterflyType2StarPattern {
    public static void nForrest(int n) {
        for (int i = 1; i <= 2 * n-1 ; i++) {
            for (int j = 1; j <= 2 * n ; j++) {
                if ((j <=i && i + j <= 2 * n && j<=n)||(j + i >= 2*n+1 &&  j >= i+1 && j>=n))  {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nForrest(n);
        sc.close();
    }
}
