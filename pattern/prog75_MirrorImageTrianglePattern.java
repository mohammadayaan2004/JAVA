/*/
1 2 3 4  
 2 3 4
  3 4
   4
  3 4
 2 3 4  
1 2 3 4
/*/
import java.util.Scanner;
public class prog75_MirrorImageTrianglePattern 
{
    public static void nForest(int n) 
    {
        //upper pyramid
        for (int i = 1; i <=n; i++) 
        {
            for (int j = 1; j <=i-1; j++)
            {
                System.out.print(" ");// SPACE    
            } 
            int k=i;
            for (int j = 1; j <=n-i+1; j++)
            {
                System.out.print(k+" ");// STAR
                k++;
            } 
            System.out.println(" ");
        } 
        //lower pyramid
        for (int i = 2; i <=n; i++) 
        {
            for (int j = 1; j <=n-i; j++)
            {
                System.out.print(" ");// SPACE    
            } 
            int k=n-i+1;
            for (int j = 1; j <=i; j++)
            {
                System.out.print(k+" ");// STAR
                k++;
            } 
            System.out.println(" ");
        } 
    }    
    public static void main(String[] args) 
    {
        System.out.print("Number of rows :- ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        nForest(n);
        sc.close();
    }
}