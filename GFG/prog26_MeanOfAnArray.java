/* 
https://www.geeksforgeeks.org/problems/mean0021/1

Mean of an Array
Given an unsorted array arr[], the task is to find the mean of the 
array. 

Note: Return the floor value of the mean.

Examples:


Input: arr[] = [1, 3, 4, 2, 6, 5, 8, 7]
Output: 4
Explanation: Sum of the elements is 1 + 3 + 4 + 2 + 6 + 5 + 8 + 7 = 36,
Mean = 36/8 = 4

Input: arr[] = [4, 4, 4, 4, 4]
Output: 4
Explanation: Sum of the elements is 4 + 4 + 4 + 4 + 4 = 20, Mean = 20/5 
= 4
Constraints:
1 <= arr.size() <= 10^6
1 <= arr[i] <= 10^6

*/
package GFG;
import java.util.Scanner;
public class prog26_MeanOfAnArray {
    public static int findMean(int[] arr) {
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum/arr.length;
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length of array :- ");
        int len=sc.nextInt();
        int[] arr=new int[len];
        System.out.println("Enter array elements:");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Result :- " + findMean(arr));
        sc.close();
    }
}
