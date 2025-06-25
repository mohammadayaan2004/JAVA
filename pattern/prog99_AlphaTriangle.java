/*
https://www.naukri.com/code360/problems/alpha-triangle_6581429    \
D
DC
DCB
DCBA
*/
import java.util.Scanner;
public class prog99_AlphaTriangle {
    public static void nForest(int n)
    {
        for (int i = 1; i <= n ; i++) {
            char k= (char) (64 + n);
            for (int j = 1; j <= i ; j++) {
                System.out.print(k);
                k--;
            }
            System.out.println();
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

