//.equals() is a method used to compare two objects to check if their contents (or values) are the same.
import java.util.Scanner;
public class prog57_EqualFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter :- ");
        String name1=sc.nextLine();
        System.out.print("Enter :- ");        
        String name2=sc.nextLine();      
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals("MAK"));
        sc.close();
    }    
}
