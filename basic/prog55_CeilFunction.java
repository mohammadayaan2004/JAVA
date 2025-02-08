//It rounds up a given number to the smallest integer that is 
//greater than or equal to the number.

import java.util.Scanner;
public class prog55_CeilFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Number : ");
        float num = sc.nextFloat();
        
        System.out.println( Math.ceil(num));
        
        sc.close();
    }
}
