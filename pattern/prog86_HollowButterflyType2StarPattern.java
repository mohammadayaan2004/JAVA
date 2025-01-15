/*/
*      *
**    **
* *  * *
*  **  *
* *  * *
**    **
*      *   
/*/
import java.util.Scanner;
public class prog86_HollowButterflyType2StarPattern {
    public static void nForrest(int n) {
        for (int i = 1; i <= 2 * n-1; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                
                if(j == 2 * n || j == 1 ){
                    System.out.print("*");
                }
                else if(i==j || i+j==2*n ){
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
