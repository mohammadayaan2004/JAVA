/* 
https://leetcode.com/problems/hamming-distance/
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, return the Hamming distance between them.

 

Example 1:

Input: x = 1, y = 4
Output: 2
Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑
The above arrows point to positions where the corresponding bits are different.
Example 2:

Input: x = 3, y = 1
Output: 1
 

Constraints:

0 <= x, y <= 231 - 1
*/
package leetcode;

import java.util.Scanner;

public class prog24_Q461_HammingDistance {
    public static int hammingDistance(int x, int y) {
        int n = x>y ? x :y;
        int count=0;
        while(n>0){
            int r1=x%2;
            int r2=y%2;
            if(r1 != r2){ count++;}
            x/=2;
            y/=2;
            n/=2;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();
        System.out.print("Please Enter a Number :- ");
        int num2 = sc.nextInt();

        System.out.print("Result :- " + hammingDistance(num,num2));
        sc.close();
    } 
}
