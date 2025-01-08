import java.util.Scanner;
public class prog15_relationalOperators {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number :- ");
    int num1=sc.nextInt();
    System.out.print("Enter another number :- ");
    int num2=sc.nextInt();  
      
    System.out.println("Relational Opertor are as follows :- ");
    System.out.println("num1 equal to num2: " + (num1 == num2));
    System.out.println("num1 not equal to num2: " + (num1 != num2));
    System.out.println("num1 greater than num2: " + (num1 > num2));
    System.out.println("num1 less than num2: " + (num1 < num2));
    System.out.println("num1 greater than or equal to num2: " + (num1 >= num2));
    System.out.println("num1 less than or equal to num2: " + (num1 <= num2));     
    sc.close();
    }
}