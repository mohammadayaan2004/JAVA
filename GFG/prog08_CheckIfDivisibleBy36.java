package GFG;
import java.util.Scanner;
//import java.math.BigInteger;
public class prog08_CheckIfDivisibleBy36 {
    public static int checkDivisible36(String S) {
        java.math.BigInteger num= new java.math.BigInteger(S);
        if(num.mod(java.math.BigInteger.valueOf(36)).equals(java.math.BigInteger.ZERO))
        return 1; // mod--->>> modulus opertor
        return 0;
        // O(nlogn)
        /*
         *  int len = S.length();
    int lastTwoDigits = Integer.parseInt(S.substring(len - 2));
    if (lastTwoDigits % 4 != 0) {
        return 0;
    }
    
    // Check divisibility by 9: sum of digits should be divisible by 9
    int sumOfDigits = 0;
    for (int i = 0; i < len; i++) {
        sumOfDigits += S.charAt(i) - '0'; // Convert char to int
    }
    if (sumOfDigits % 9 != 0) {
        return 0;
    }
    
    return 1; // Number is divisible by both 4 and 9 (and hence 36)

    ----->>>>>to be done again 
    
    O(n)
         */
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        String s = sc.nextLine();
        System.out.print("Result :- " +checkDivisible36(s));
        sc.close();
    }
}



