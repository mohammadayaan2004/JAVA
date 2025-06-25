/*
https://www.geeksforgeeks.org/problems/check-if-a-number-is-power-of-another-number5442/1

Check for Power
Given two positive numbers X and Y, check if Y is a power of X or not.

Example 1:

Input:
X = 2, Y = 8
Output:
1
Explanation:
2^3 is equal to 8.
 
Example 2:
Input:
X = 1, Y = 8
Output:
0
Explanation:
Any power of 1 is not 
equal to 8.
 
Your Task:

You don't need to read input or print anything. Your task is to complete the function isPowerOfAnother() which takes an integer and returns 1 if y is the power of x, else return 0.

Expected Time Complexity: O(logx(y))
Expected Auxiliary Space: O(1)

Constraints: 
1 <= x <= 103
1 <= y <= 108
*/

package GFG;
import java.util.Scanner;
public class prog10_CheckForPower {
    public static long isPowerOfAnother(Long X, Long Y) {
        //O(logₓY)
        //if (X==1) return (Y==1)? 1:0;
        //while(Y%X==0){
        //    Y/=X;
        //}
        //return (Y==1)? 1:0;
        //O(1)
        if (X==1) return (Y==1)? 1:0;
        double result=Math.log(Y)/Math.log(X);
        return (result==Math.floor(result))? 1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        long num1 = sc.nextLong();
        System.out.print("Enter :- ");
        long num2 = sc.nextLong();
        System.out.print("Result :- " + isPowerOfAnother(num1,num2));
        sc.close();
    }
}
