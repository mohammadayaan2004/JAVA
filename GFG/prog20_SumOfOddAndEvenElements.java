/*
https://www.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1

Sum of odd and even elements
Given an integer n, Return an array containing the sum of odd numbers 
and even numbers from 1 to n, where the first number is the sum of odd 
numbers and the second number is the sum of even numbers.

Examples:

Input: n = 5
Output: 9 6
Explanation: Odd numbers upto 5 are 1, 3, 5 and their sum = 1 + 3 + 5 = 
9.Even numbers upto 5 are 2 and 4 and their sum = 2 + 4 = 6.
Input: n = 6
Output: 9 12
Explanation: Odd numbers upto 6 are 1, 3, 5 and their sum = 1 + 3 + 5 = 
9.Even numbers upto 5 are 2 , 4 and 6 and their  sum = 2 + 4 + 6  = 12.
Constraints:
1 <= n <= 104
*/
package GFG;
import java.util.Arrays;
import java.util.Scanner;
public class prog20_SumOfOddAndEvenElements {
    public static int[] findSum(int n){
        //time complexity :- O(n)
        //int sum_Even=0,sum_Odd=0;
        //for(int i=1;i<=n;i++){
        //    if(i%2==0){
        //        sum_Even+=i;
        //    }
        //    else{
        //        sum_Odd+=i;
        //    }
        //}
        //return new int[]{sum_Odd,sum_Even};
        //time complexity :- O(1)
        int oddCount=(n+1)/2;
        int evenCount=n/2;

        int sumOdd=oddCount*oddCount;
        int sumEven=evenCount*(evenCount+1);
        
        return new int[]{sumOdd,sumEven};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Result :- " + Arrays.toString(findSum(n)));
        sc.close();
    } 
}
