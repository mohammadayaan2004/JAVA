/*
https://www.naukri.com/code360/problems/reverse-number-triangle_6581889
1 2 3 4  
1 2 3  
1 2  
1  
*/
import java.util.Scanner;
public class prog64_numberIncreasingReversePyramid {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int k=1;
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(k+" ");
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