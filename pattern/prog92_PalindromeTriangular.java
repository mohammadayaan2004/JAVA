/*/
   1
  212
 32123
4321234   
/*/
import java.util.Scanner;
public class prog92_PalindromeTriangular {
    public static void nForrest(int n) {
        for (int i = 1; i <=  n  ; i++) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            int k=i;
            for (int j = 1; j <= i  ; j++) {
                System.out.print(k);
                k--;
            }
            for (int j = 2; j <= i  ; j++) {
                System.out.print(j);
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
