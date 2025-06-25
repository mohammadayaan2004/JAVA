/*
https://www.naukri.com/code360/problems/n-forest_6570177

 *    ***
 *    ***
 *    ***
 */
import java.util.Scanner;
public class prog55_squareFillPattern {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
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
