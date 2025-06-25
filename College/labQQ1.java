import java.util.Scanner;
public class labQQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first term, common difference, and number of terms
        System.out.print("Enter the first term (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference (d): ");
        int d = scanner.nextInt();
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        System.out.println("Arithmetic Progression Series:");
        for (int i = 0; i < n; i++) {
            int term = a + i * d; // Formula for nth term: a + (n-1)d
            System.out.print(term + " ");
        }

        scanner.close();
    }
}
