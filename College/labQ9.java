
public class labQ9  {

    // Method to demonstrate 'throws' keyword
    public static void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero"); // Using 'throw' keyword
        } else {
            System.out.println("Result: " + (numerator / denominator));
        }
    }

    public static void main(String[] args) {
        try {
            // Try block where exception can occur
            divide(10, 0);
        } catch (ArithmeticException e) {
            // Catch block to handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Finally block that always executes
            System.out.println("Execution completed, whether an exception occurred or not.");
        }
    }
}
