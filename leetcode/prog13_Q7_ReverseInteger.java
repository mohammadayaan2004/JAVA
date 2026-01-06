/*
https://leetcode.com/problems/reverse-integer/

leetcode Q7. Reverse Integer

Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer 
range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers 
(signed or unsigned).


Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1 */
package leetcode;
import java.util.Scanner;
public class prog13_Q7_ReverseInteger {
    public static int reverse(int x){
        int rem ;
        int sum = 0;
        while(x!=0){
            rem = x % 10 ;
            if(sum > Integer.MAX_VALUE / 10 || sum < Integer.MIN_VALUE/10 )  
                {return 0;}       
            sum = sum * 10 + rem ;
            x /= 10 ;
        }
        return sum;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + reverse(num));
        sc.close();
    }    
}
