/*
https://www.geeksforgeeks.org/problems/cube-root-of-a-number0915/1
Given a number n, find the cube root of n.

Note: We need to print the floor value of the result.

Examples:

Input: n = 3
Output: 1
Explanation: Cube root of 3 is 1.442 = 1
Input: n = 8
Output: 2
Explanation: Cube root of 8 is 2
Constraints:
 */
package GFG;
import java.util.Scanner;
public class prog06_cubeRootOfANumber {
    public static int cubeRoot(int num) {
        /*  if (n == 0 || n == 1) return n;
solution 1} int i;
            for(i=1;i*i*i<n;i++);
            return i-1;
            T.C.--->O(∛n)
            S.C.--->O(1)
        
            if (num == 0 || num == 1) return num;
solution2}  int n=Math.abs(num);
            int low=1,high=n,ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                long cube=(long)mid*mid*mid;
                if(cube==n) return (num < 0) ? -mid : mid;
                else if(cube<n){
                    ans=mid;
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            return (num<0)?-ans:ans;
            T.C.--->O(log n)
            S.C.--->O(1)*/
            
            return (int) (Math.cbrt(num));
            //O(∛n)
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + cubeRoot(num));
        sc.close();
    }
}


