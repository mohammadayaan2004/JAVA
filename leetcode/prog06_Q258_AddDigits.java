/*
https://leetcode.com/problems/add-digits/description/
258. Add Digits
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:
Input: num = 0
Output: 0
 
Constraints:

0 <= num <= 231 - 1
 

Follow up: Could you do it without any loop/recursion in O(1) runtime?
 */
package leetcode;
import java.util.Scanner;
public class prog06_Q258_AddDigits {
    public static int addDigits(int n) {
        //int sum, remainder;
        //while (n > 9) {
        //    sum=0;
        //    while (n > 0) {
        //         remainder = n % 10;
        //        sum += remainder;
        //        n /= 10;
        //    }
        //    n=sum;
        // }
        //return n;
        //Time Complexity: O(log(n))
        //Space Complexity: O(1) (constant space)
        if(n==0) return 0;
        return 1 +(n-1)%9;
        //Time Complexity: O(1) because this formula directly computes the result.
        //Space Complexity: O(1) (constant space).
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + addDigits(num));
        sc.close();
    }
}

