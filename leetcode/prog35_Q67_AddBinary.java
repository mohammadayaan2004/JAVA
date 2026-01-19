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
        // binary number 
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);
        int n = a.length()> b.length() ? a.length() :b.length();
        int carry =0;
        int sum=0;
        int place=1;
        while(n>0){
            int ld1=n1%10;
            int ld2=n2%10;
            if(ld1 == 0 && ld2 == 0){
                sum=sum*place+0;
            }
            else if((ld1 ==1 && ld2==0) ||(ld1 ==0 && ld2==1) ){
                sum=sum*place+1;
            }
            else if(ld1 == 1 && ld2 ==1){
                sum=sum*place+0;
                carry=1;
            }
            place*=10;
            n1/=10;
            n2/=10;
            n--;
        }
        return String.valueOf(carry*10+sum);
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
