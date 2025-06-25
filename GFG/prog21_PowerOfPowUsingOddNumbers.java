/* 
https://www.geeksforgeeks.org/problems/power-of-pow-odd-numbers1103/1

Power of Pow | Odd Numbers
Given a single integer N, your task is to find the sum of the square of 
the first N odd natural Numbers.
 
Example 1:
Input: 2
Output: 10
Explanation: 1^2 + 3^2 = 10
Example 2: 
Input: 3
Output: 35
Explanation: 1^2 + 3^2 + 5^2 = 35
*/
package GFG;
import java.util.Scanner;
public class prog21_PowerOfPowUsingOddNumbers {
    public static long sum_of_square_oddNumbers(long n){
        // Time Complexity = O(n).
        //long sum=0;
        //for(int i=1,count=0;count<n;i+=2,count++){
        //    sum+=Math.pow(i,2);
        //}
        //return sum;
        // Time Complexity = O(1)
        return (n * (2 * n - 1) * (2 * n + 1)) / 3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        long n = sc.nextLong();
        System.out.print("Result :- " + sum_of_square_oddNumbers(n));
        sc.close();
    } 
}
