/* 
https://www.naukri.com/code360/problems/n-triangles_6573689
 * 1
 * 1 2
 * 1 2 3 
 * 1 2 3 4
 * 1 2 3 4 5
*/
import java.util.Scanner;
public class prog62_numberIncreasingPyramidPattern {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int k=1;
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
                k++;
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