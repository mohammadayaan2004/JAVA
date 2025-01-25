/*
https://www.geeksforgeeks.org/problems/sum-of-digits1742/1
Given a number n. Find the sum of all the digits of n.

Examples:

Input: n = 12
Output: 3
Explanation: Sum of 12's digits: 1 + 2 = 3
Input: n = 23
Output 5
Explanation: Sum of 23's digits: 2 + 3 = 5
Constraints:
1<= n <=105


 */
package GFG;

import java.util.Scanner;

public class prog03_NarcissisticNumber {
    public static int isNarcissistic(int n) {
        int duplicate=n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        n=duplicate;
        double sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + Math.pow(digit,count);
            n /= 10;
        }
        return (duplicate==sum)?1:0;
    }   

    public static void main(String[] args) {
        System.out.print("Enter Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isNarcissistic(n));
        sc.close();
    }
}
