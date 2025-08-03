//return the number of element in arrays or number of character in string 
import java.util.Scanner;
public class prog56_LengthFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter :- ");
        String name=sc.nextLine();
        System.out.println("Length of " +name + ":- " + name.length());
        
        int arr[]= {10,20,30,40,40,50,65};
        System.out.println("Length of array :- " + arr.length);
        sc.close();
    }    
}
