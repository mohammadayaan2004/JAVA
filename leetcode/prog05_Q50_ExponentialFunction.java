/*
https://leetcode.com/problems/powx-n/description/
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

Example 1:
Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:
Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:
Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
 
Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
n is an integer.
Either x is not zero or n > 0.
-104 <= xn <= 104

 */
package leetcode;
import java.util.Scanner;
public class prog05_Q50_ExponentialFunction {
    public static double myPow(double x, long n) {
        double result=1;
        long exp=Math.abs(n);
        while(exp >0){
            if(exp%2==1){
                result*=x;
            }
            x*=x;
            exp/=2;
        }
        return (n<0)?1/result : result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Base Number :- ");
        double num1 = sc.nextDouble();
        System.out.print("Please Enter a Exponential Number :- ");
        long num2 = sc.nextLong();

        System.out.print("Result :- " + myPow(num1, num2));
        sc.close();
    }
}
//T.C.==O(logn) since the exponent is halved in each step of the while loop.
//S.P.==O(1) since no extra space is used for recursion.
