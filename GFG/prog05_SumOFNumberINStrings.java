/*
https://www.geeksforgeeks.org/problems/sum-of-numbers-in-string-1587115621/1
Sum of numbers in string
Difficulty: BasicAccuracy: 63.01%Submissions: 60K+Points: 1
Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.

Examples:

Input: s = "1abc23"
Output: 24
Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.
Input: s = "geeks4geeks"
Output: 4
Explanation: 4 is the only number, so the sum is 4.
Constraints:
1 <= length of the string <= 105
The sum of Numbers <= 105
    public static int findSum(String s) {
        int sum=0;
        String temp="0";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }
            else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }       
        return sum+Integer.parseInt(temp);
    }
        T.C=O(n^2)
        S.C=O(n)
 */
package GFG;
import java.util.Scanner;
public class prog05_SumOfNumberInStrings {
    public static int findSum(String s) {
        int sum=0,num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch -'0');
            }
            else{
                sum+=num;
                num=0;
            }
        }       
        return sum+num;
    }
    //T.C=O(n)
    //S.C=O(1)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        String n = sc.nextLine();
        System.out.println(findSum(n));
        sc.close();
    }
}
