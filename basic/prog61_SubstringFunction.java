//str.substring(startIndex)
//str.substring(startIndex, endIndex)
import java.util.Scanner;
public class prog61_SubstringFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        String name1=sc.nextLine();
        System.out.print("Enter :- ");        
        String name2=sc.nextLine();
        
        System.out.println(name1.substring(2));
        System.out.println(name2.substring(4,7));
        sc.close();
    }
}
