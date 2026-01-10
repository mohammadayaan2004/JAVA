/* 

Leetcode Q191. Number of 1 Bits

https://leetcode.com/problems/number-of-1-bits/description/

Write a function that takes the binary representation of a positive integer and returns the number of
set bits
 it has (also known as the Hamming weight).



Example 1:

Input: n = 11
Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.

Example 2:

Input: n = 128

Output: 1

Explanation:

The input binary string 10000000 has a total of one set bit.

Example 3:

Input: n = 2147483645

Output: 30

Explanation:

The input binary string 1111111111111111111111111111101 has a total of thirty set bits.



Constraints:

1 <= n <= 231 - 1
*/
package leetcode;

import java.util.Scanner;

public class prog22_Q191_NumberOf1Bits {
    public static int hammingWeight(int n) {
        int count=0;
        while(n>0){
            if(n%2 == 1) {count++; }
            n/=2;             
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + hammingWeight(num));
        sc.close();
    }  
}
