/*
https://www.naukri.com/code360/problems/triangle_6573690
1
2 2 
3 3 3
 */
import java.util.Scanner;
public class prog66_trianglePattern {
    public static void nForest(int n)
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
            }
            k++;
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
