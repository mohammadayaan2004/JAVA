//https://www.naukri.com/code360/problems/number-of-digits_9173?leftPanelTabValue=SUBMISSION

package numberPrograms;
import java.util.Scanner;
public class prog07_CountDigit {
    public static int countDigits(int n){
        //        int count = String.valueOf(n).length();
        int count=0;
        while(n>0)
        {
            count++;
            n/=10;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        int n=sc.nextInt();
        System.out.print(countDigits(n));
        sc.close();
    }
}
