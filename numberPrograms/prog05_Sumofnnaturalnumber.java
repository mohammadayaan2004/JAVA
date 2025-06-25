package numberPrograms;
import java.util.Scanner;
public class prog05_Sumofnnaturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of natural numbers you want to sum");
        int n=sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print("Sum :- "+sum);
        sc.close();
    }
}
