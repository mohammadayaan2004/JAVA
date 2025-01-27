package GFG;
import java.util.Scanner;
public class prog05_SumOFNumberINStrings {
    public static int findSum(String s) {
        int str=Integer.valueOf(s);
        int sum=0;
        while(str>0){
            int lastdigit=str%10;
            if(!(lastdigit>=47 && lastdigit<=58)){
                sum+=lastdigit;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        String n = sc.nextLine();
        System.out.println(findSum(n));
        sc.close();
    }
}
