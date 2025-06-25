/* 
https://www.geeksforgeeks.org/problems/simple-interest3457/1

Simple Interest
Given three integers p, r and t, denoting Principal, Rate of Interest 
and Time period respectively. Your task is to calculate Simple Interest.

Examples:

Input: p = 100, r = 20, t = 2
Output: 40.00
Explanation: The simple interest on 100 at a rate of 20% across 2 time 
periods is 40.
Input: p = 999, r = 9, t = 9
Output: 809.19
Explanation: The simple interest on 999 at a rate of 9% across 9 time 
periods is 809.19
Constraints:
1<=p<=105
1<=r, 
t<=100
*/
package GFG;
import java.util.Scanner;
public class prog18_SimpleInterest {
    static double simpleInterest(int P, int R, int T){
        return (P*R*T/100.0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter P :- ");
        int P = sc.nextInt();
        System.out.print("Enter R :- ");
        int R = sc.nextInt();
        System.out.print("Enter T :- ");
        int T = sc.nextInt();
        System.out.print("Result :- " + simpleInterest(P,R,T));
        sc.close();
    } 
}
