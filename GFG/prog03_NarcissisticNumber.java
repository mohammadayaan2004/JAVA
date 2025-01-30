/*



 */
package GFG;

import java.util.Scanner;

public class prog03_NarcissisticNumber {
    public static int isNarcissistic(int n) {
        int duplicate=n;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        n=duplicate;
        double sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + Math.pow(digit,count);
            n /= 10;
        }
        return (duplicate==sum)?1:0;
    }   

    public static void main(String[] args) {
        System.out.print("Enter Number :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isNarcissistic(n));
        sc.close();
    }
}
