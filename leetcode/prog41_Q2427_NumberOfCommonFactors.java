/*
https://leetcode.com/problems/number-of-common-factors/

Given two positive integers a and b, return the number of common factors of a and b.

An integer x is a common factor of a and b if x divides both a and b.

 

Example 1:

Input: a = 12, b = 6
Output: 4
Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
Example 2:

Input: a = 25, b = 30
Output: 2
Explanation: The common factors of 25 and 30 are 1, 5.
 

Constraints:

1 <= a, b <= 1000
*/
package leetcode;

import java.util.Scanner;

public class prog41_Q2427_NumberOfCommonFactors {
    public static int commonFactors(int a, int b) {
        int n= (a>b)?a:b;
        int count=0;
        for(int i=1;i<=n;i++){
        if(a%i==0 && b%i==0){
            count++;
        }
       }
               return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = sc.nextInt();
        System.out.print("Enter a number :- ");
        int n1 = sc.nextInt();
        System.out.print("Common Number:- " + commonFactors(n,n1));
        sc.close();
    }    
}
