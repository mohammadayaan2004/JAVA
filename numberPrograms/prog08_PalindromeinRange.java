package numberPrograms;
import java.util.Scanner;
public class prog08_PalindromeinRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit :- ");
        int ll=sc.nextInt();
        System.out.print("Enter the upper limit :- ");
        int ul=sc.nextInt();
        System.out.println("Palindromes in the range are :-");
        for(int i=ll;i<=ul;i++)
        {
            int reverse=0,lastdigit;
            int temp=i;
            while(temp>0){
            lastdigit=temp%10;
            reverse=reverse*10+lastdigit;
            temp/=10;
        }
        if(i==reverse){System.out.print(i+" ");}
    }
        sc.close();
    }    
}
