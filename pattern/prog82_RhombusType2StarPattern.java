/*/
*****
 *****
  *****
   *****
    *****   
/*/
import java.util.Scanner;
public class prog82_RhombusType2StarPattern {
    public static void nForrest(int n) {
        for (int i = 1; i <=  n  ; i++) {
            for (int j = 1; j <= i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n  ; j++) {
                System.out.print("*");
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

