/*
https://leetcode.com/problems/multiply-strings/

Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 

Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
*/
package leetcode;

import java.math.BigInteger;
import java.util.Scanner;

public class prog34_Q43_MultiplyStrings {
    public static String multiply(String num1, String num2) {
        BigInteger n1= new BigInteger(num1);
        BigInteger n2= new BigInteger(num2);
        return n1.multiply(n2).toString();
        //approach is not correct . have to do again without BigInteger
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        String num = sc.nextLine();
        System.out.print("Please Enter a Number :- ");
        String num2 = sc.nextLine();
        System.out.print("Result :- " + multiply(num,num2));
        sc.close();
    }
}
