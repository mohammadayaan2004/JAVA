/*
https://www.geeksforgeeks.org/problems/automorphic-number4721/1

Automorphic Number
Given a number N, check whether the number is Automorphic number or not.
A number is called Automorphic number if and only if its square ends in  
has the same last digit as the number itself.
 
Example 1:

Input: N = 76
Output: Automorphic
Explanation: 76^2 = 5776 which ends with 
6 which was also the last digt in original number therefore it is a 
automorphic number.
Example 2:

Input: N = 14
Output: Not Automorphic
Explanation: 14^2 = 196 which ends with 
6 but the last digt in original number is 4 therefore it is not a automorphic number.
 */
package GFG;
import java.util.Scanner;
public class prog22_AutomorphicNumber {
    public static String is_AutomorphicNumber(int n){
        long power=n*n;
        return (power%10==n%10)?"Automorphic":"Not Automorphic";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        int n = sc.nextInt();
        System.out.print("Result :- " + is_AutomorphicNumber(n));
        sc.close();
    } 
}