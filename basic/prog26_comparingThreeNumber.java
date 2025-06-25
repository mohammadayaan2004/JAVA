import java.util.Scanner;
public class prog26_comparingThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter first number :- ");
        num1=sc.nextInt();
        System.out.print("Enter second number :- ");
        num2=sc.nextInt();
        System.out.print("Enter third number :- ");
        num3=sc.nextInt();   
        int largest;
        if (num1>=num2 && num1>=num3) 
        {
            largest=num1;
        } 
        else if (num2>=num1 && num2>= num3)
        {
            largest=num2;    
        }
        else
        {
            largest=num3;
        }
        System.out.println("Largest Number is :- "+largest);
        sc.close();
    }
}
