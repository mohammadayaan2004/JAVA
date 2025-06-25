import java.util.Scanner;

public class labQ3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer: ");
            
            try {
                long input = scanner.nextLong(); // Reads input as long to handle larger values
    
                System.out.println(input + " can be stored in:");
    
                // Check each type by comparing input with each type’s range
                if (input >= Byte.MIN_VALUE && input <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (input >= Short.MIN_VALUE && input <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (input >= Integer.MIN_VALUE && input <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (input >= Long.MIN_VALUE && input <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
    
            } catch (Exception e) {
                System.out.println("The number is too large to fit in any primitive integer data type in Java.");
            }
            scanner.close();
        }
    
}
