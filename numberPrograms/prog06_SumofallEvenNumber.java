package numberPrograms;
import java.util.Scanner;
public class prog06_SumofallEvenNumber {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n=sc.nextInt(),sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
            sum+=i;
            }
        }
        System.out.print("Sum :- "+sum);
        sc.close();
    }   
}
