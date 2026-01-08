/* 

https://leetcode.com/problems/two-sum/

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
*/
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class prog16_Q1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int [2];
            for(int i=0;i<nums.length;i++){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[i]+nums[j] == target){
                        result[0]=i;
                        result[1]=j;
                    }
                }
            }
        return result;
    }

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        // input size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        // input array
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // input target
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Result: " + Arrays.toString(result));

        sc.close();
    }
}