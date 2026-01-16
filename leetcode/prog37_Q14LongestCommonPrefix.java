/* 
https://leetcode.com/problems/longest-common-prefix/

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/
package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class prog37_Q14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length - 1];

        int len = Math.min(first.length(), last.length());
        int i = 0;

        while (i < len && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] nums = new String[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLine();
        }
        System.out.print("Result :- " + longestCommonPrefix(nums));
        sc.close();
    }
}
