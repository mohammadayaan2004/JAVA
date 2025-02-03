/*
*/
package GFG;
import java.util.Scanner;
public class prog09_CheckAnIntegerIsPowerOf3OrNo {
    public static String isPowerof3(int N) {
/*  while (N % 3 == 0) {
            N /= 3;

        }
        return N == 1 ? "Yes" : "No";
Approach	            Time Complexity	Space Complexity
Loop-based (Original)	   O(log N)        	 O(1)
Optimized (Modulo check)	 O(1)	         O(1)

        1162261467=3^19
        3^20 >>> Integer.MAX_VALUE
*/
        
        return (1162261467 % N == 0) ? "Yes" : "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        int s = sc.nextInt();
        System.out.print("Result :- " + isPowerof3(s));
        sc.close();
    }
}
