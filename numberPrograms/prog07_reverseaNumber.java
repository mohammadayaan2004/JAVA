package numberPrograms;
import java.util.Scanner;
public class prog07_reverseaNumber {
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int n=sc.nextInt(),reverse=0,temp=n;
        while (n>0) {
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        System.out.print("Reverse of "+temp +" is :- "+reverse);
        sc.close();
    }   
}    

