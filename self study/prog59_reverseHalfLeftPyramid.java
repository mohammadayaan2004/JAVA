/*  *****
*    ****
*     ***
*      **
*       *
*/
public class prog59_reverseHalfLeftPyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i-1;j++)//space
            {
                System.out.print(" ");
            }
            for(int j=1;j<=6-i;j++)//star
            {
                System.out.print("*");
            }
            
            System.out.println(" ");
        }
    }
}
