import java.util.Scanner;
public class prog33_switchStatement {
    public static void main(String[] args) {
        System.out.println("MAIN OPTION LIST ARE :- ");
        System.out.println("Addition :- Press 1");
        System.out.println("Subtraction :- Press 2");
        System.out.println("Multiplication :- Press 3");
        System.out.println("Division :- Press 4");
        System.out.println("Modulus :- Press 5");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        int input = sc.nextInt();
        
        System.out.print("Waiting for first operand: ");
        int a = sc.nextInt();
        
        System.out.print("Waiting for second operand: ");
        int b = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case 3:
                System.out.println(a + " x " + b + " = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5:
                if (b != 0) {
                    System.out.println(a + " % " + b + " = " + (a % b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid Inputs given by the user");
                break;
        }
        sc.close();
    }
}
