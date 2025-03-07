/* 
https://www.geeksforgeeks.org/problems/perfect-number3759/1

Perfect Number

Given a number N. Check if it is perfect or not. A number is perfect if 
sum of factorial of its digit is equal to the given number.

Example 1:
Input: N = 23
Output: 0
Explanation: The sum of factorials of digits of 
23 is 2! + 3! = 2 + 6 = 8 
which is not equal to 23. Thus, answer is 0.

Example 2:
Input: N = 145
Output: 1
Explanation: The sum of factorials of digits of 
145 is 1! + 4! + 5! = 1 + 24 + 120 = 145 
which is equal to 145.Thus, answer is 1.

Your Task:
You don't need to read input or print anything.Your task is to complete 
the function isPerfect() which takes a number N as input parameter and 
returns 1 if N is perfect.Otherwise, it returns 0.

Expected Time Complexity: O(Log10N)
Expected Auxillary Space: O(constant)

Constraints:
1<=N<=10^9
*/
package GFG;
import java.util.Scanner;
public class prog24_PerfectNumber {
    //T.C. == O(log N)
    /* 
    public static int factorial(int n){
        if(n == 0 || n==1 ){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static int isPerfect(int N) {
        int temp=N;
        int fact=0;
        while(N>0){
            int digit=N%10;
            fact+=factorial(digit);
            N/=10;
        }
        return (fact==temp)?1:0;
    }*/
    private static final int[] FACTORIAL=new int[10];
    static{
        FACTORIAL[0]=1;
        int fact=1;
        for(int i=1;i<10;i++){
            fact*=i;
            FACTORIAL[i]=fact;
        }
    }
    public static int isPerfect(int N) {
        int temp=N;
        int fact=0;
        while(N>0){
            fact+= FACTORIAL[N % 10];
            N/=10;
        }
        return (fact==temp)?1:0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Result :- " + isPerfect(n));
        sc.close();
    } 
}
