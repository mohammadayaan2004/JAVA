/*
https://leetcode.com/problems/binary-number-with-alternating-bits/

Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.

 

Example 1:

Input: n = 5
Output: true
Explanation: The binary representation of 5 is: 101
Example 2:

Input: n = 7
Output: false
Explanation: The binary representation of 7 is: 111.
Example 3:

Input: n = 11
Output: false
Explanation: The binary representation of 11 is: 1011.
 

Constraints:

1 <= n <= 231 - 1
 

*/
package leetcode;

import java.util.Scanner;

public class prog26_Q693_BinaryNumberWithAlternatingBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + hasAlternatingBits(num));
        sc.close();
    }

    public static boolean hasAlternatingBits(int n) {
        int previosBit=-1;
        while (n > 0) {
            int rem = n % 2;
            if(previosBit == rem){
            return false;
            }
            else {
                previosBit=rem;
                n/=2;
            }
        }
        return true;
    }
}
