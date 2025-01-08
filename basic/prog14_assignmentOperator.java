import java.util.Scanner;
public class prog14_assignmentOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int a=sc.nextInt();
        System.out.print("Enter another number :- ");
        int b=sc.nextInt();
        System.out.println("Assignment Operators as follows :- ");
        System.out.println("Initial value of a:- "+a);
        System.out.println("Initial value of b:- "+b);
        System.out.println("Addition Assignment:- "+(a+=b));
        System.out.println("Subtraction Assignment:- "+(a-=b));
        System.out.println("Multiplication Assignment:- "+(a*=b));
        System.out.println("Division Assignment:- "+(a/=b));
        System.out.println("Modulus Assignment:- "+(a%=b));
        sc.close();
    }
}
