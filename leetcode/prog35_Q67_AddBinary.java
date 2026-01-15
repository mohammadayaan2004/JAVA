/* 
https://leetcode.com/problems/add-binary/

Given two binary strings a and b, return their sum as a binary string.

 

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

1 <= a.length, b.length <= 104
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/
package leetcode;

import java.util.Scanner;

public class prog35_Q67_AddBinary {
    public static String addBinary(String a, String b) {
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        String num = sc.nextLine();
        System.out.print("Please Enter a Number :- ");
        String num2 = sc.nextLine();
        System.out.print("Result :- " + addBinary(num,num2));
        sc.close();
    }
}
