/*
https://www.naukri.com/code360/problems/n-2-forest_6570178
 *  *
 *  **
 *  ***
 *  ****
 *  *****
 */

import java.util.Scanner;
public class prog56_rightHalfPyramid {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
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
