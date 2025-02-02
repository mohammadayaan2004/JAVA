package GFG;
import java.util.Scanner;
import java.math.BigInteger;
public class prog08_CheckIfDivisibleBy36 {
    public static int checkDivisible36(String S) {
         num=Integer.parseInt(S);
        if(num%36==0) return 1;
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



