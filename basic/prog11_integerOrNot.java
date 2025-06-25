import java.util.Scanner;
public class prog11_integerOrNot {
    public static void main(String[] args) {
        System.out.print("Enter a number :- ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
        sc.close();
    }    
}
