/*
https://leetcode.com/problems/power-of-four/description/

Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.

 

Example 1:

Input: n = 16
Output: true
Example 2:

Input: n = 5
Output: false
Example 3:

Input: n = 1
Output: true
 

Constraints:

-231 <= n <= 231 - 1
 

Follow up: Could you solve it without loops/recursion?
*/
package leetcode;

import java.util.Scanner;

public class prog20_Q342_PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
            while (n % 4 == 0) {
                n /= 4;
            }
            return n == 1;
          
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + isPowerOfFour(num));
        sc.close();
    }
}
