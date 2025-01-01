/*
 *            1    
 *           2 2   
 *          3 3 3  
 *         4 4 4 4 
 *        5 5 5 5 5
 */
public class prog61_numberTriangular {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)//space
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
}
