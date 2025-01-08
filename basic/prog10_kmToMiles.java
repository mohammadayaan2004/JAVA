import java.util.Scanner;
public class prog10_kmToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float kilometer,miles;
        System.out.print("Enter the value of kilometer :- ");
        kilometer=sc.nextFloat();
        miles=kilometer * 0.621371f;
        System.out.println(kilometer+" kilometer is equal to "+miles+" miles");
        sc.close();
    }
}

