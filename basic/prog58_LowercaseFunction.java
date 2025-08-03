import java.util.Scanner;
public class prog58_LowercaseFunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character in uppercase :- ");
        String str = sc.nextLine();
        System.out.print("In lowercase :- "+str.toLowerCase());
        sc.close();
    }
}