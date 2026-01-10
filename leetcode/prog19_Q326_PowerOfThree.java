/* 
https://leetcode.com/problems/power-of-three/

Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.

 

Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33
Example 2:

Input: n = 0
Output: false
Explanation: There is no x where 3x = 0.
Example 3:

Input: n = -1
Output: false
Explanation: There is no x where 3x = (-1).
 

Constraints:

-231 <= n <= 231 - 1
*/
package leetcode;

import java.util.Scanner;

public class prog19_Q326_PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        } else {
            while (n % 3 == 0) {
                n /= 3;
            }
            return n == 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + isPowerOfThree(num));
        sc.close();
    }
}
