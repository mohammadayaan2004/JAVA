/* 
https://www.naukri.com/code360/problems/increasing-letter-triangle_6581897 
A 
AB 
ABC 
ABCD 
ABCDE 
*/
import java.util.Scanner;
public class prog95_IncreasingLetterTriangle {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            char k='A';
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