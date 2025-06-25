import java.util.Scanner;
public class prog05_gettingUserInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1 :- ");
        int a=sc.nextInt();
        
        System.out.print("Enter num 2 :- ");
        int b=sc.nextInt();
        
        int sum=a+b;
        System.out.print("Sum of num 1 and num 2 is :- "+sum);
        sc.close();
    }
}