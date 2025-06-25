/* 
1   2  3 4 
12 13 14 5 
11 16 15 6 
10  9  8 7
*/
import java.util.Scanner;
public class prog102_SpiralPattern {
    public static void nForrest(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            for (int j = 1; j <= 2 * n; j++) {
                
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

