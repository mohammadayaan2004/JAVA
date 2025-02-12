/*
https://www.geeksforgeeks.org/problems/disarium-number1045/1

Disarium Number
Given a number N, find if it is Disarium or not. 
A number is called Disarium if sum of its digits powered with their 
respective positions is equal to the number itself. Output 1 if it's 
Disarium, and 0 if not.

Example 1:
Input:N = 89
Output:1
Explanation:
8^1+9^2 = 89 thus output is 1.
Example 2:

Input:N = 81
Output: 0
Explanation:
8^1+1^2 = 9 thus output is 0. 
 
Your Task:
You don't need to read input or print anything. Your task is to complete the function isDisarium() which takes an Integer N as input and returns the answer.

Expected Time Complexity: O(log(N))
Expected Auxiliary Space: O(1)

Constraints:
0 <= N <= 108
*/
package GFG;
import java.util.Scanner;
public class prog14_DisariumNumber {
    //METHOD 1:--- 
    //public static int count(int N){
    //    int count=0;
    //    while(N>0){
    //        N/=10;
    //        count++;
    //    }
    //    return count;
    //}
    //public static int isDisarium(int N) {
    //    int temp=N;
    //    int sum=0;
    //    int totalDigit=count(N);
    //    while(temp>0){
    //        int lastdigit=temp%10;
    //        sum+=Math.pow(lastdigit,totalDigit);
    //        totalDigit--;
    //        temp/=10;
    //    }
    //    return (sum==N)?1:0;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num = sc.nextInt();
       
        System.out.print("Result :- " + isDisarium(num));
        sc.close();
    }   
}
     

