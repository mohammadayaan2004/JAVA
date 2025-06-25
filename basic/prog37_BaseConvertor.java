import java.util.Scanner;

public class prog37_BaseConvertor {

    public static boolean valid(int n1, String n) {
        if (n1 == 1) { // binary check
            for (char digit : n.toCharArray()) {
                if (digit != '1' && digit != '0') {
                    return false;
                }
            }
            return true;
        } else if (n1 == 2) { // decimal check
            for (char digit : n.toCharArray()) {
                if (!(digit >= '0' && digit <= '9')) {
                    return false;
                }
            }
            return true;
        } else if (n1 == 3) { // octal check
            for (char digit : n.toCharArray()) {
                if (!(digit >= '0' && digit <= '7')) {
                    return false;
                }
            }
            return true;
        } else { // hexadecimal check
            for (char digit : n.toUpperCase().toCharArray()) {
                if (!((digit >= '0' && digit <= '9') || (digit >= 'A' && digit <= 'F'))) {
                    return false;
                }
            }
            return true;
        }
    }

    public static int toDecimal(int base, String numStr) {
        int ans = 0;
        if (base == 1) { // binary to decimal
            int n = Integer.parseInt(numStr);
            int i = 0;
            while (n > 0) {
                int rem = n % 10;
                n = n / 10;
                ans += rem * Math.pow(2, i);
                i++;
            }
            System.out.println("Decimal Number is: " + ans);
        } else if (base == 3) { // octal to decimal
            int n = Integer.parseInt(numStr);
            int i = 0;
            while (n > 0) {
                int rem = n % 10;
                ans += rem * Math.pow(8, i);
                i++;
                n = n / 10;
            }
            System.out.println("Decimal Number is: " + ans);
        } else { // hexadecimal to decimal
            int len = numStr.length();
            for (int i = 0; i < len; i++) {
                char digit = numStr.charAt(len - 1 - i);
                int rem = (digit >= '0' && digit <= '9') ? digit - '0' : digit - 'A' + 10;
                ans += rem * Math.pow(16, i);
            }
            System.out.println("Decimal Number is: " + ans);
        }
        return ans;
    }

    public static void fromDecimal(int targetBase, String numStr) {
        int ans = 0;
        int mul = 1;
        if (targetBase == 1) { // decimal to binary
            int n = Integer.parseInt(numStr);
            while (n > 0) {
                int rem = n % 2;
                n = n / 2;
                ans += rem * mul;
                mul *= 10;
            }
            System.out.println("Binary Number is: " + ans);
        } else if (targetBase == 3) { // decimal to octal
            int n = Integer.parseInt(numStr);
            while (n > 0) {
                int rem = n % 8;
                n = n / 8;
                ans += rem * mul;
                mul *= 10;
            }
            System.out.println("Octal Number is: " + ans);
        } else { // decimal to hexadecimal
            StringBuilder hex = new StringBuilder();
            int n = Integer.parseInt(numStr);
            while (n > 0) {
                int rem = n % 16;
                hex.insert(0, (char) (rem < 10 ? '0' + rem : 'A' + rem - 10));
                n /= 16;
            }
            System.out.println("Hexadecimal Number is: " + hex);
        }
    }

    public static String baseNumber(int base) {
        return switch (base) {
            case 1 -> "Binary";
            case 2 -> "Decimal";
            case 3 -> "Octal";
            case 4 -> "Hexadecimal";
            default -> "Unknown";
        };
    }

    public static void same(String num) {
        System.out.println(num);
    }

    public static void check(int number) {
        if (number < 1 || number > 4) {
            System.out.println("Invalid Input");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the input base (1: Binary, 2: Decimal, 3: Octal, 4: Hexadecimal): ");
        int n1 = scanner.nextInt();
        check(n1);

        System.out.print("Enter " + baseNumber(n1) + ": ");
        String num = scanner.next();
        if (!valid(n1, num)) {
            System.out.println("Invalid Input");
            System.exit(1);
        }

        System.out.print("Convert to (1: Binary, 2: Decimal, 3: Octal, 4: Hexadecimal): ");
        int n2 = scanner.nextInt();
        check(n2);

        System.out.println("Converting " + baseNumber(n1) + " to " + baseNumber(n2));
        if (n1 == n2) {
            same(num);
        } else if (n1 == 2) {
            fromDecimal(n2, num);
        } else if (n2 == 2) {
            toDecimal(n1, num);
        } else {
            int decimalValue = toDecimal(n1, num);
            fromDecimal(n2, String.valueOf(decimalValue));
        }

        scanner.close();
    }
}
