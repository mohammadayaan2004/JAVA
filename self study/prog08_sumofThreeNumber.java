import java.util.Scanner;
public class prog08_sumofThreeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,c,total;
        System.out.print("Enter number 1:- ");
        a=sc.nextInt();
        System.out.print("Enter number 2:- ");
        b=sc.nextInt();
        System.out.print("Enter number 3:- ");
        c=sc.nextInt();
        total=a+b+c;
        System.out.print("Sum of three number is :- "+total);
        sc.close();
    }
}
