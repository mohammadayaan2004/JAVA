package numberPrograms;
import java.util.Scanner;
public class prog02_fibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();
        int a=0,b=1,result;
        for(int i=1;i<=num;i++)
        {
            System.out.print(a+" ");
            result=a+b;
            a=b;
            b=result;
        } 
        sc.close();
    }
}
