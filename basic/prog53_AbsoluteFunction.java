//In Java, the Math.abs() method is used to return the absolute value
//of a given number. It works for int, long, float, and double types, 
//and it returns the absolute value (i.e., removes the sign of the 
//number).

// -4564--->>>4564
import java.util.Scanner;

public class prog53_AbsoluteFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        
        System.out.print("Enter a float: ");
        float b = sc.nextFloat();
        
        System.out.print("Enter a double: ");
        double c = sc.nextDouble();
        
        System.out.print("Enter a long: ");
        long d = sc.nextLong();
        
        System.out.println("Absolute value of integer: " + Math.abs(a));
        System.out.println("Absolute value of float: " + Math.abs(b));
        System.out.println("Absolute value of double: " + Math.abs(c));
        System.out.println("Absolute value of long: " + Math.abs(d));
        
        sc.close();
    }
}
