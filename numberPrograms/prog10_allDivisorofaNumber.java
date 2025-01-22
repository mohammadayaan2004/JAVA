//https://www.naukri.com/code360/problems/print-all-divisors-of-a-number_1164188
package numberPrograms;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class prog10_allDivisorofaNumber {
    public class Solution{
    public static List< Integer > printDivisors(int n) {
        List <Integer> divisor =new ArrayList<>();
        for(int i=1 ;i<=n; i++)
        {
            if(n%i==0)
            {
                divisor.add(i);
            }
        }
        return divisor;
    }
}
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number :- ");
    int n=sc.nextInt();
    List <Integer> result = Solution.printDivisors(n);
    System.out.print(result);
    sc.close();
}
}