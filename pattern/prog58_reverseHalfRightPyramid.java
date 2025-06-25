/*  *****
*   ****
*   ***
*   **
*   *
*/
import java.util.Scanner;
public class prog58_reverseHalfRightPyramid  {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
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
  