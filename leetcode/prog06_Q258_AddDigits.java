/*

 */
package leetcode;
import java.util.Scanner;
public class prog06_Q258_AddDigits {
    public static int addDigits(int n) {
        if (n == 0) return 0;
        return 1 + (n - 1) % 9;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Number :- ");
        int num = sc.nextInt();

        System.out.print("Result :- " + addDigits(num));
        sc.close();
    }
}
// T.C.==O(logn) since the exponent is halved in each step of the while loop.
// S.P.==O(1) since no extra space is used for recursion.
