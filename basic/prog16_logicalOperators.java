import java.util.Scanner;
public class prog16_logicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a boolean value :- ");
        boolean a=sc.nextBoolean();
        System.out.print("Enter a boolean value :- ");
        boolean b=sc.nextBoolean(); 
        System.out.println("Logical opertors are as follows :- ");
        System.out.println("Logical AND : "+(a&&b));
        System.out.println("Logical OR : "+(a||b));
        System.err.println("Logical NOT : "+(!a));
        System.err.println("Logical NOT : "+(!b));


        sc.close();
    }
}