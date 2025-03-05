/*
https://www.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1

Sum of Digit is Palindrome or not
Given a number n. Return true if the digit sum(or sum of digits) of n 
is a Palindrome number otherwise false.

A Palindrome number is a number that stays the same when reversed

Examples:

Input: n = 56
Output: true
Explanation: The digit sum of 56 is 5+6 = 11. Since, 11 is a palindrome 
number.Thus, answer is true.
Input: n = 98
Output: false
Explanation: The digit sum of 98 is 9+8 = 17. Since 17 is not a 
palindrome,thus, answer is false.
 */
package GFG;
import java.util.Scanner;
public class prog23_SumOfDigitIsPalindromeOrNot {
    public static boolean isDigitSumPalindrome(int n) {
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        int reverse=0;
        int originalSum=sum;
        while(sum>0){
            reverse=reverse*10+sum%10;
            sum/=10;
        }
        return originalSum == reverse;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Result :- " + isDigitSumPalindrome(n));
        sc.close();
    } 
}