import java.util.Scanner;
public class prog41_reverseMultiplication {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter a number who table is to be executed :- ");
        int num=sc.nextInt();
        int n = 10;
        while(n>=1)
        {
            System.out.println(num+" * "+n+" = "+num*n);
            n=n-1;
        }
        sc.close();
    }
}



