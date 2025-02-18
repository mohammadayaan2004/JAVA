/* 
https://www.geeksforgeeks.org/problems/sum-of-an-ap1025/1

Sum of an AP
Given n, a and d as the number of terms, first term and common 
difference respectively of an Arthimetic Series. Find the sum of the 
series upto nth term.
 
Example 1:

Input: 5 1 3
Output: 35
Explanation: Series upto 5th term is
1 4 7 10 13, so sum will be 35.
Example 2:

Input: 3 1 2
Output: 9
Example: Series upto 3rd term is 
1 3 5, so sum will be 9.
 
Your Task:
You don't need to read or print anything. Your task is to complete the 
function sum_of_ap() which takes n, a and d as input parameter and 
returns the sum of the series.
 
Expected Time Complexity: O(1)
Expected Space Complexity: O(1)
 
Constranits:
1 <= n, a, d <= 100
*/
package GFG;
import java.util.Scanner;
public class prog19_SumOfArithmeticProgression {
    public static int sum_of_ap(int n, int a, int d){
        return (n * (2 * a + (n - 1) * d)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
        System.out.print("Enter a :- ");
        int a = sc.nextInt();
        System.out.print("Enter d :- ");
        int d = sc.nextInt();
        System.out.print("Result :- " + sum_of_ap(n,a,d));
        sc.close();
    } 
}
