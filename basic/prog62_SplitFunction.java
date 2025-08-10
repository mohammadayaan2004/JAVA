//It is used to split a string into an array of substrings based on a regular expression (regex) 
import java.util.Arrays;
import java.util.Scanner;
public class prog62_SplitFunction {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");  
        String name=sc.nextLine();      
        String arrname[]=name.split(":");
        System.out.println(Arrays.toString(arrname));
        sc.close();    
     }
}
