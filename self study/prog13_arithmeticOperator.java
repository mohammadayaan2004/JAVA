import java.util.Scanner;
public class prog13_arithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num1=sc.nextInt();
        System.out.print("Enter another number :- ");
        int num2=sc.nextInt();
        System.out.println("Arithmetic Opertor are as follows :- ");
        System.out.println("Addition :- "+(num1+num2));
        System.out.println("Subtraction :- "+(num1-num2));
        System.out.println("Multiplication operation  :- "+(num1*num2));
        System.out.println("Division operation :- "+(num1/num2));
        System.out.println("Modulo operation :- "+(num1%num2));        
        sc.close();
        //arithmetic operation cannot be performed with a boolean value
    }
}
