/*
 *            1    
 *           2 2   
 *          3 3 3  
 *         4 4 4 4 
 *        5 5 5 5 5
 */
import java.util.Scanner;
public class prog61_numberTriangular  {
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
                System.out.print(i+" ");
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
