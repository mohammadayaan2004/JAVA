/*/
1         1
1 2     2 1
1 2 3 3 2 1   
https://www.naukri.com/code360/problems/number-crown_6581894
/*/
import java.util.Scanner;
public class prog89_NumberCrown {
    public static void nForrest(int n) {
        for (int i = 1; i <= n ; i++) {
            int k=1;
            for (int j = 1; j <= i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            for (int j = 1; j <= 2*(n-i) ; j++) {
                System.out.print("  ");
            }
            k=i;
            for (int j = 1; j <= i ; j++) {
                System.out.print(k+" ");
                k--;
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
