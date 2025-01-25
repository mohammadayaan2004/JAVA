import java.util.Scanner;

public class prog52_ExponentialFunction {
    public static double calulatePower(double x, long n) {
        if(n==0){ return 1;}
        if(n<0){ return calulatePower(1/x,-n);}
        if(n%2==0){
            return calulatePower(x*x,n/2);
        }
        return x * calulatePower(x*x,(n-1)/2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a Base Number :- ");
        double num1 = sc.nextDouble();
        System.out.print("Please Enter a Exponential Number :- ");
        long num2 = sc.nextLong();

        System.out.print("Result :- " + calulatePower(num1, num2));
        sc.close();
    }
}
