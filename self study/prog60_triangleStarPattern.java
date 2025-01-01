/*
 *            *    
 *           * *   
 *          * * *  
 *         * * * * 
 *        * * * * *
 */
public class prog60_triangleStarPattern {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i;j++)//space
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
}
