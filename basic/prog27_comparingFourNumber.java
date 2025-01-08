import java.util.Scanner;
public class prog27_comparingFourNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4;
        System.out.print("Enter first number :- ");
        num1=sc.nextInt();
        System.out.print("Enter second number :- ");
        num2=sc.nextInt();
        System.out.print("Enter third number :- ");
        num3=sc.nextInt();   
        System.out.print("Enter four number :- ");
        num4=sc.nextInt(); 
        int largest;
        
        if (num1>=num2 && num1>=num3 && num1>=num4) 
        {
            largest=num1;
        } 
        else if (num2>=num1 && num2>=num3 && num2>=num4)
        {
            largest=num2;    
        }
        else if (num3>=num1 && num3>=num2 && num3>=num4)
        {
            largest=num3;
        }
        else
        {
            largest=num4;
        }
        System.out.println("Largest Number is :- "+largest);
        sc.close();
    }
}


