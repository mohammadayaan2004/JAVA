import java.util.Scanner;
public class prog54_factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        System.out.print("Factorial of "+num+" is :- "+fact(num));
        sc.close();    
    }
    public static int fact(int n)
    {
        if(n == 0 || n==1 )
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }
}
