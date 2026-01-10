/* 
https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
Given an integer n, return true if it is possible to represent n as the sum of distinct powers of three. Otherwise, return false.

An integer y is a power of three if there exists an integer x such that y == 3x.

 

Example 1:

Input: n = 12
Output: true
Explanation: 12 = 31 + 32
Example 2:

Input: n = 91
Output: true
Explanation: 91 = 30 + 32 + 34
Example 3:

Input: n = 21
Output: false
 

Constraints:

1 <= n <= 107
*/
package leetcode;

import java.util.Scanner;

public class prog21_Q1780_CheckIfNumberIsASumOfPowersOfThree {
    public static boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3 == 2 ){
                return false;
            }
            n/=3;
        }
        return  true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + checkPowersOfThree(num));
        sc.close();
    }    
}
