/*
 * https://leetcode.com/problems/palindrome-number/
leetcode Q9
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?

 */
package leetcode;
import java.util.Scanner;
public class prog01_Q09_Palindrome  {
    public static boolean isPalindrome(int n) {
        int temp=n,lastdigit,reverse=0;
        while(n>0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n/=10;
        }
        if(temp==reverse){return true;}
        else {return false;}
    }
    public static void main(String[] args) {
        System.out.print("Enter Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isPalindrome(n));
        sc.close();
    }
}


