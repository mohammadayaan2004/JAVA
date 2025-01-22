/*
https://leetcode.com/problems/reverse-integer/submissions/1517248737/
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

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

-231 <= x <= 231 - 1
 */
package leetcode;
import java.util.Scanner;
public class Q07_reverseaNumber {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n=sc.nextInt(),reverse=0,temp=n;
        boolean isNegative=n<0;
        n=Math.abs(n);

        while (n>0) {
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        if(isNegative){
            reverse=-reverse;
        }
        System.out.print("Reverse of "+temp +" is :- "+reverse);
        sc.close();
    }   
}    

