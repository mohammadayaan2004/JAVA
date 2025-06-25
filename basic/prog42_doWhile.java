import java.util.Scanner;
public class prog42_doWhile {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter a number who table is to be executed :- ");
        int num=sc.nextInt();
        int n = 1;
        do
        {
            System.out.println(num+" * "+n+" = "+num*n);
            n=n+1;
        }while(n<=10);
        sc.close();
    }
}

