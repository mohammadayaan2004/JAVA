/*
 *            *    
 *           * *   
 *          * * *  
 *         * * * * 
 *        * * * * *
 */
import java.util.Scanner;
public class prog60_triangleStarPattern  {
    public static void nForest(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)//space
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)//star
            {
                System.out.print("* ");
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
  
