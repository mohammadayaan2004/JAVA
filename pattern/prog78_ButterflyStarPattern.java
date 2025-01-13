/*/
https://youtu.be/UTW2t4gOiJA?si=cUB1OmPj17SjLpeM
*     *
**   **
*** ***
*******
*** ***
**   **
*     *   
/*/
import java.util.Scanner;
public class prog78_ButterflyStarPattern {
    public static void nForrest(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                if ((j <=i   && i + j <= 2 * n && j<=n)||(j + i >= 2*n &&  j >= i && j>=n))  {
                    System.out.print("*");
                } else {
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
