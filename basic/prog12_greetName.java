import java.util.Scanner;
public class prog12_greetName {
    public static void main(String[] args) {
        System.out.print("Enter Name :- ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("Hello "+name+" How are you??");
        sc.close();
    }    
}
