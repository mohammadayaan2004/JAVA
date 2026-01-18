/*

https://leetcode.com/problems/ugly-number-ii/
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

 

Example 1:

Input: n = 10
Output: 12
Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 

Constraints:

1 <= n <= 1690
 

*/
package leetcode;

import java.util.Scanner;

public class prog40_264_UglyNumberII {
    public static int nthUglyNumber(int n) {
        int count = 1;
        int i = 1;
        while (count < n) {
            i++;
            int temp = i;
            while (temp % 2 == 0) {
                temp /= 2;
            }
            while (temp % 3 == 0) {
                temp /= 3;
            }
            while (temp % 5 == 0) {
                temp /= 5;
            }
            if (temp == 1) {
                count++;
            }
        }
        return i;
        // TLE error 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.print("Ugly Number:- " + nthUglyNumber(n));
        sc.close();
    }
}
