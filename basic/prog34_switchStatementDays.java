import java.util.Scanner;
public class prog34_switchStatementDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the day of the week (1-7) :- ");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
            System.out.print("Monday");
            break;
            case 2:
            System.out.print("Tuesday");
            break;
            case 3:
            System.out.print("Wednesday");
            break;
            case 4:
            System.out.print("Thursday");
            break;
            case 5:
            System.out.print("Friday");
            break;
            case 6:
            System.out.print("Saturday");
            break;
            case 7:
            System.out.print("Sunday");
            break;
            default:
            System.out.print("Invalid Inputs given by the user");
            break;
        }
        sc.close();      
    }
}
