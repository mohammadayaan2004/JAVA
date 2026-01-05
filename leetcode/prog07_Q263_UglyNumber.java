/* 
Leetcode Q263 Ugly Number

https://leetcode.com/problems/ugly-number/

An ugly number is a positive integer whose prime factors are
limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.


Example 1:

Input: n = 6
Output: true
Explanation: 6 = 2 × 3
Example 2:

Input: n = 1
Output: true
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
Example 3:

Input: n = 14
Output: false
Explanation: 14 is not ugly since it includes the prime factor 7.


Constraints:

-231 <= n <= 231 - 1
*/
package leetcode;
import java.util.Scanner;
public class prog07_Q263_UglyNumber {
    public static boolean isUgly(int n) {
        if(n<=0) return false;
        else if(n==1) return true;
        else if(n%2==0) return isUgly(n/2);
        else if(n%3==0) return isUgly(n/3);
        else if(n%5==0) return isUgly(n/5);
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n =sc.nextInt();
        System.out.print("Ugly Number:- "+isUgly(n));
        sc.close();
    }
    
}
