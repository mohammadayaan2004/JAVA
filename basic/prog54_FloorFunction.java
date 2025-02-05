//In Java, the Math.floor() method is used to round a floating-point 
//number down to the nearest integer that is less than or equal to the 
//given number. It returns a double value.
import java.util.Scanner;
public class prog54_FloorFunction{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        float num=sc.nextFloat();//675498.907667 
        System.out.print(Math.floor(num));//675498.0
        sc.close();
    }
}
