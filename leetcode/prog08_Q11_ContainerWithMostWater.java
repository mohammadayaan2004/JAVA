/*
https://leetcode.com/problems/container-with-most-water/description/

11. Container With Most Water

You are given an integer array height of length n. There 
are n vertical lines drawn such that the two endpoints of 
the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:
Input: height = [1,1]
Output: 1
 
*/
package leetcode;
import java.util.Scanner;
public class prog08_Q11_ContainerWithMostWater{
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int area = width * minHeight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int[] numbers = new int[9];  // Declare an array
        for (int i = 0; i < 9; i++) {
            numbers[i] = sc.nextInt();  // Store values in the array
        }
        System.out.print("Result :- " + maxArea(numbers));
        sc.close();   
    }
}