/*
https://www.geeksforgeeks.org/problems/minimum-sum-of-factors5829/1

Minimum sum of factors :---
Given a number N.Find the minimum sum of its factors.

Example 1:

Input:
N=10
Output:
7
Explanation:
There are two ways to factories N, which are
10=1*10(sum=10+1=11)
10=2*5(sum=2+5=7)
Thus, the answer is 7.
Example 2:

Input:
N=12
Output:
7
Explanation:
There are  ways to factorise N, which are
12=12*1(sum=12+1=13)
12=3*4(sum=3+4=7)
12=6*2(sum=6+2=8)
12=2*3*2(sum=2+3+2=7).

Your Task:
You don't need to read input or print anything. Your task is to complete the function sumOfFactors() which takes a number N as an input parameter and returns the minimum sum of its factors.


Expected Time Complexity:O(N^1/2)
Expected Auxillary Space:O(1)

*/
package GFG;
import java.util.Scanner;
public class prog25_MinimumSumOfFactors {
    public static int sumOfFactors(int n){
        int minNum=n+1;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                int j=n/i;
                minNum=Math.min(minNum,i+j);
                for(int k=1;k*k<=j;k++){
                    if(j%k==0){
                        int l=j/k;
                        minNum=Math.min(minNum,i+k+l);
                    }
                }
            }
        }
        return minNum;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Result :- " + sumOfFactors(n));
        sc.close();
    }
}
