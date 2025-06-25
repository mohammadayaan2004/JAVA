/*
https://www.naukri.com/code360/problems/ninja-and-the-star-pattern-i_6581920
****
*  *
*  *
****
 */
import java.util.Scanner;
public class prog67_squareHallowPattern {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                System.out.print("*");
                }
                else
                System.out.print(" ");
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
