/*
https://www.geeksforgeeks.org/problems/closest-number5728/1
Given two integers n and m. The problem is to find the number closest to n and divisible by m. If there is more than one such number, then output the one having the maximum absolute value.

Examples :
Input: n = 13 , m = 4
Output: 12
Explanation: 12 is the Closest Number to 13 which is divisible by 4.
Input: n = -15 , m = 6
Output: -18
Explanation: -12 and -18 are both similarly close to -15 and divisible by 6. but -18 has the maximum absolute value. So, Output is -18
Input: n = -6 , m = 39
Output: 0
Constraints:
-105 <= n, m <= 105
 */
package GFG;
import java.util.Scanner;
public class prog07_ClosestNumber {
    public static int closestNumber(int n, int m) {
        m = Math.abs(m);
        int q=n/m;
        int val1=m*q;
        int val2;

        if(n>=0) val2=val1+m;
        else val2=val1-m;

        if(Math.abs(n-val1)>Math.abs(n-val2)) return val2;
        else if(Math.abs(n-val1)<Math.abs(n-val2)) return val1;
        else return (Math.abs(val1)>Math.abs(val2))?val1:val2;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int n = sc.nextInt();
        System.out.print("Please Enter a Number :- ");
        int m = sc.nextInt();
        System.out.print("Result :- " +closestNumber(n,m));
        sc.close();
    }
}



