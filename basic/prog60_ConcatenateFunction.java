// .toUpperCase() function is used to convert all characters in a string to uppercase.
import java.util.Scanner;
public class prog60_ConcatenateFunction{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        String name1=sc.nextLine();
        System.out.print("Enter :- ");        
        String name2=sc.nextLine();
        
        System.out.println(name1.concat(name2));
        System.out.println(name1+name2);
        sc.close();
    }
}
