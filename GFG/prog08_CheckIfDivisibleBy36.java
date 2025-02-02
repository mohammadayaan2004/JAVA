package GFG;
import java.util.Scanner;
public class prog08_CheckIfDivisibleBy36 {
    public static int checkDivisible36(String S) {
        java.math.BigInteger num= new java.math.BigInteger(S);
        if(num.mod(java.math.BigInteger.valueOf(36)).equals(java.math.BigInteger.ZERO))
        return 1; // mod--->>> modulus
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        String s = sc.nextLine();
        System.out.print("Result :- " +checkDivisible36(s));
        sc.close();
    }
}



