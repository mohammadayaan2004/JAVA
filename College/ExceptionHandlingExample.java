import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            System.out.println("You entered: " + number);
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}