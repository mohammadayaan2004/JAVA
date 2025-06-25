import java.util.Scanner;
public class prog44_forLoop 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a number who table is to be executed :- ");
        int num=sc.nextInt();
        for(int i =1 ; i<=10 ; i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
        sc.close();
    }    
}
