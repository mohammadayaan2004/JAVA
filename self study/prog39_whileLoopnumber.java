import java.util.Scanner;
public class prog39_whileLoopnumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Please enter a number :- ");
        int n = sc.nextInt();
        while(n>=100 && n<=200)
        {
            System.out.print(n+" ");
            n=n+1;
        }
        sc.close();
    }
}

