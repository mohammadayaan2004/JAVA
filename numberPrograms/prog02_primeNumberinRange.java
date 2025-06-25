package numberPrograms;
import java.util.Scanner;
public class prog02_primeNumberinRange 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter a number :- ");
        int num2 = sc.nextInt();
        int i,j;
        for (i = num1; i <= num2; i++) 
        {
            for (j = 2; j <= i; j++) 
            {
                if (i % j == 0) 
                {
                    break;
                }
            }
            if(j==i){System.out.print(i+" ");}
        }
        sc.close();
    }
}
