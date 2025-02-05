/*
https://www.geeksforgeeks.org/problems/check-if-a-number-can-be-expressed-as-xy1606/1

Check if a number can be expressed as x^y
Given a positive integer N, find if it can be expressed as xy where y > 1 and x > 0 and x and y both are both integers.

Example 1:
Input:N = 8
Output: 1
Explanation:8 can be expressed as 2^3.
 
Example 2:
Input:N = 7
Output:0
Explanation:7 can't be expressed int the form xy.
 
Your Task:

You don't need to read input or print anything. Your task is to complete the function checkPower() which takes an integer N and returns 1 if possible else, 0.

Expected Time Complexity: O(sqrt(N))
Expected Auxiliary Space: O(1)

Constraints:
1<= N <=10000
*/

package GFG;
import java.util.Scanner;
public class prog11_CheckIfANumberCanBeExpressedAsXpowerY {
    public static int checkPower(int N) {
    //    for(int i=1;i<=Math.sqrt(N);i++){
    //        for(int j=1;j<=N;j++){
    //            if(Math.pow(i,j)==N){
    //                return 1;
    //            }
    //        }
    //    }
    //    return 0;
    //    O(sqrt(N)×N×logN) ==O(N^1.5 logN)
    if (N == 1) return 1; 
    for (int i = 2; i * i <= N; i++) {
        double result = Math.log(N) / Math.log(i);  
        if (result == Math.floor(result)) { 
            return 1; 
        }
    }
    return 0; 
    // O(sqrt(N))
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
        
        System.out.print("Result :- " + checkPower(num));
        sc.close();
    }
}
