/*/
*****
 *   *
  *   *
   *   *
    *****  
/*/
import java.util.Scanner;
public class prog84_HollowRhombusType2StarPattern {
    public static void nForrest(int n) {
        for (int i = 1; i <=  n  ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n  ; j++) {
                if(i==1||i==n||j==1||j==n)
                System.out.print("*");
                else
                System.out.print(" ");

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

