/* 
https://www.naukri.com/code360/problems/alpha-ramp_6581888
A
B B
C C C
*/
import java.util.Scanner;
public class prog96_AlphaRamp {
    public static void nForest(int n)
    {
        char k='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k);
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