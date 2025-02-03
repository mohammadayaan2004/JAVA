/*
https://www.geeksforgeeks.org/problems/check-a-integer-is-power-of-3-or-not3850/1

Check an Integer is power of 3 or not
Given a positive integer N, write a function to find if it is a power of three or not.

Example 1:

Input:
N = 3
Output:
Yes
Explanation:
31 is a power of 3.
 

Example 2:

Input:
N = 5
Output:
No
Explanation:
5 is not a power of 3.
 

Your Task:

You don't need to read input or print anything. Your task is to complete the function isPowerof3() which takes an integer N and returns "Yes" if N is a power of 3, else "No" if N is not a power of 3.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1<=N<=(32-bit largest integer)

*/
package GFG;
import java.util.Scanner;
public class prog09_CheckAnIntegerIsPowerOf3OrNo {
    public static String isPowerof3(int N) {
/*  while (N % 3 == 0) {
            N /= 3;

        }
        return N == 1 ? "Yes" : "No";
Approach	            Time Complexity	Space Complexity
Loop-based (Original)	   O(log N)        	 O(1)
Optimized (Modulo check)	 O(1)	         O(1)

        1162261467=3^19
        3^20 >>> Integer.MAX_VALUE
*/
        
        return (1162261467 % N == 0) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        int s = sc.nextInt();
        System.out.print("Result :- " + isPowerof3(s));
        sc.close();
    }
}
