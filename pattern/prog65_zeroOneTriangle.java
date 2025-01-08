/*
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
https://www.naukri.com/code360/problems/binary-number-triangle_6581890?leftPanelTabValue=PROBLEM
 */
import java.util.Scanner;

public class prog65_zeroOneTriangle {
    public static void nForest(int n) {
        int k;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)//even
                // (i%2!=0 && j%2!=0)||(i%2==0 && j%2==0)
                {
                    k = 1;
                    System.out.print(k + " ");
                } else {
                    k = 0;
                    System.out.print(k + " ");
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
