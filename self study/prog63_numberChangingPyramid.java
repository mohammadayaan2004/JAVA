/*
1  
2 3  
4 5 6  
7 8 9 10 
 */
import java.util.Scanner;
public class prog63_numberChangingPyramid {
    public static void nForest(int n)
    {
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
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
