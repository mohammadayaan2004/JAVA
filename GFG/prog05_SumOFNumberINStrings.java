package GFG;
import java.util.Scanner;
public class prog05_SumOFNumberINStrings {
    public static int findSum(String s) {
        int sum=0;
        String temp="0";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                temp+=ch;
            }
            else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
        }       
        return sum+Integer.parseInt(temp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        String n = sc.nextLine();
        System.out.println(findSum(n));
        sc.close();
    }
}
