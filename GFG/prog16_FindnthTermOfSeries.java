/*
https://www.geeksforgeeks.org/problems/find-n-th-term-of-series-1-3-6-10-15-215506/1

Find n-th term of series 1, 3, 6, 10, 15, 21

Given a number n, find the nth term in the series 1, 3, 6, 10, 15, 21…

Examples:

Input: n = 4 
Output: 10
Explanation: The 4th term of the Series is 10.
Input: n = 3 
Output: 6
Explanation: The 3rd term of the Series is 6.
Constraints:
1 <= n <= 104

Time Complexity: O(1)
Auxiliary Space: O(1)
*/
package GFG;
import java.util.Scanner;
public class prog16_FindnthTermOfSeries {
    //METHOD 1:--- O(n)
    //static int findNthTerm(int n){
    //    int sum=0;
    //    for(int i=1;i<=n;i++){
    //        sum+=i;
    //    }
    //    return sum;
    //}
    //METHOD 2:--- O(1)
    static int findNthTerm(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        
        System.out.print("Result :- " + findNthTerm(num));
        sc.close();
    } 
}
