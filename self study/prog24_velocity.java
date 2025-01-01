import java.util.Scanner;
public class prog24_velocity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u,a,s;
        System.out.print("Enter the initial velocity :- ");
        u=sc.nextInt();
        System.out.print("Enter acceleration :- ");
        a=sc.nextInt();
        System.out.print("Enter speed :- ");
        s=sc.nextInt(); 
        double v=Math.sqrt((u*u+2*a*s));    
        System.out.println("Final velocity is :- "+v);
        sc.close();    
    }
}
