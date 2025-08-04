// .toUpperCase() function is used to convert all characters in a string to uppercase.
import java.util.Scanner;
public class prog59_UppercaseFunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character in lowercase :- ");
        String str = sc.nextLine();
        System.out.print("In luppercase :- "+str.toUpperCase());
        sc.close();
    }
}