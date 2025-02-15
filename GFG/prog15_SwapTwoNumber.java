/*

 */
package GFG;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class prog15_SwapTwoNumber {
    public static List<Integer> get(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        return Arrays.asList(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number :- ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Number :- ");
        int num2 = sc.nextInt();
        System.out.print("Result :- " + get(num1,num2));
        sc.close();
    } 
}
