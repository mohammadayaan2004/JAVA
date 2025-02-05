//In Java, the Math.round() method is used to round a floating-point 
//number (either float or double) to the nearest integer
import java.util.Scanner;
public class prog52_RoundFunction {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        double num=sc.nextDouble();//3456789876543.0987656354657687
        System.out.print(Math.round(num));//3456789876543
        sc.close();
    }
}
