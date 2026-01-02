/*
https://leetcode.com/problems/power-of-two/ 

Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

 

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false
 

Constraints:

-231 <= n <= 231 - 1
*/

package leetcode;
import java.util.Scanner;
public class prog12_Q231_PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
    //    Method 1 
    //    TC :- O(log n)
    //    SC :- O(log n)  

    //    if(n<=0) return false;
    //    else if (n==1) return true;
    //    else if (n%2==1) return false;
    //    return isPowerOfTwo(n/2);

    //    Method 2 
    //    TC :- O(log n)
    //    SC :- O(1)  

    //    if(n <= 0){
    //        return false;
    //    }
    //    while(n>1){
    //        if(n % 2 != 0){
    //            return false;
    //        }
    //            n = n/2;
    //        }
    //        return true;

    //    Method 3 
    //    TC :- O(1)
    //    SC :- O(1)  
    
        return (n>0 &&(n & (n-1)) == 0); 
    /*
    This expression is used to check whether a number is a power of two.
    A power of two has exactly one 1 bit in its binary representation.
    Subtracting 1 from such a number turns that single 1 into 0 and makes all lower bits 1.
    Performing a bitwise AND (&) between n and (n - 1) removes the only set bit.
    If the result is 0, it means no other 1 bits existed, so the number is a power of two.
⚠️  This check is always combined with n > 0 to avoid invalid cases like 0 or negative numbers.
    */
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n =sc.nextInt();
        System.out.print("Power Of Two :- "+isPowerOfTwo(n));
        sc.close();
    }
}