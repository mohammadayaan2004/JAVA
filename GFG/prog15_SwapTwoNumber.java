/*
https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1

Swap two numbers
You are given two numbers a and b. Your task is to swap the given two 
numbers.
Note: Try to do it without a temporary variable.

Examples:

Input: a = 13, b = 9
Output: 9 13
Explanation: After swapping it becomes 9 and 13.
Input: a = 15, b = 8
Output: 8 15
Explanation: after swapping it becomes 8 and 15.
Constraints:
1 ≤ a, b ≤ 106
 */
package GFG;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class prog15_SwapTwoNumber {
    //METHOD 1 ---->>> O(1)
    //public static List<Integer> get(int a,int b){
    //    int temp=a;
    //    a=b;
    //    b=temp;
    //    return Arrays.asList(a,b);
    //}
    //METHOD 2 ---->>> O(1)  Arithmetic-Based Swap
    //public static List<Integer> get(int a,int b){//a=5,b=10
    //    a=a+b; //a=15 [5+15]
    //    b=a-b; //b=5  [15-10]
    //    a=a-b; //10   [15-5] 
    //    return Arrays.asList(a,b);
    //}
    //METHOD 3 ---->>> O(1) InBuild Function
    public static List<Integer> get(int a,int b){
       List<Integer> numbers=new ArrayList<>(Arrays.asList(a,b));
       Collections.swap(numbers, 0, 1);
       return numbers;
    }  
    //METHOD 4 ---->>> O(1) XOR Swap
    //public static List<Integer> get(int a,int b){
    //    a=a^b;
    //    b=a^b;
    //    a=a^b;
    //    return Arrays.asList(a,b);
    //}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number :- ");
        int num2 = sc.nextInt();
        System.out.print("Result :- " + get(num1,num2));
        sc.close();
    } 
}
