/*
https://www.geeksforgeeks.org/problems/check-perfect-square5253/1
Note: Try to solve the question using only addition and subtraction operation.


Check perfect square
Example 1:

Input:
N = 35
Output: 0
Explanation:35 is not a perfect square.

Example 2:
Input:
N = 49
Output:1
Explanation: 49 is a perfect square.
 
Your Task:
You don't need to read input or print anything. Your task is to complete the function checkPerfectSquare() which takes an integer N and returns 1 if it is a perfect square, else 0.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

Constraints:
1<= N <=105
 */
package GFG;
import java.util.Scanner;
public class prog13_CheckPerfectSquare {
    public static int checkPerfectSquare(int N) {
    //    METHOD 1 :- O(√N)
    //    for(int i=1;i<=N;i++){
    //        if(i*i==N) return 1;
    //    }
    //    return 0;

    //    METHOD 2 :- O(1)
    //    int sqrt=(int) Math.sqrt(N);
    //    return (sqrt*sqrt==N)?1:0;

    //    METHOD 3 :- O(√N)
        int sum=0,odd=1;
        while(sum<N){
            sum+=odd;
            odd+=2;
            if(sum==N) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
       
        System.out.print("Result :- " + checkPerfectSquare(num));
        sc.close();
    }    
}