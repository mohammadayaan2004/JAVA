/*
https://www.geeksforgeeks.org/problems/perfect-squares-in-a-range2253/1

Given two given numbers a and b where 1<=a<=b, find the number of perfect squares between a and b (a and b inclusive).

Example 1:

Input:a = 9, b = 25
Output:3
Explanation:There are 3 perfect squares between 9 and 25. 
They are 9, 16, and 25.
Example 2:

Input:a = 1, b = 7
Output:2
Explanation:There are 2 perfect squares between 1
and 7. They are 1, and 4.
 
Your Task:
You don't need to read input or print anything. Your task is to complete the function numOfPerfectSquares() which takes 2 Integers a and b as input and returns the number of perfect squares between a and b.

Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= a <= b <= 105
 */
package GFG;
import java.util.Scanner;
public class prog12_PerfectSquaresInARange {
    public static int numOfPerfectSquares(int a, int b) {
        //     METHOD 1 --->>> O(sqrt(b))
        //     int i=0,count=0;
        //     while(i*i<a){
        //         i++;
        //     }
        //     while(i*i<=b){
        //         i++;
        //         count++;
        //     }
        //     return count;
        
        //     METHOD 2 --->>> O(1)
        int start =(int) Math.ceil(Math.sqrt(a));
        int end =(int) Math.floor(Math.sqrt(b));
        return Math.max(0,end-start+1);  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number :- ");
        int num2 = sc.nextInt();
        System.out.print("Result :- " + numOfPerfectSquares(num1,num2));
        sc.close();
    }    
}