/* 
https://leetcode.com/problems/sqrtx/
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
*/
package leetcode;

import java.util.Scanner;

public class prog38_Q69_Sqrt_x {
    public static int mySqrt(int x) {
        int ans=0;
        for (long i = 0; i * i <= x; i++) {
            if (i * i == x)
                return (int) i;
            ans = (int) i; 
        }
        return ans;
        // return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + mySqrt(num));
        sc.close();
    }
}
