import java.util.Scanner;
public class prog25_comparingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number :- ");
        num1=sc.nextInt();
        System.out.print("Enter second number :- ");
        num2=sc.nextInt();
        if(num1>num2)
        {
            System.out.print("Largest :- "+num1);
        }
        else if (num1<num2) 
        {
            System.out.print("Largest :- "+num2);
        } 
        else 
        {
            System.out.println(num1+" = "+num2);    
        }
        sc.close();
    }
}
