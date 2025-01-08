import java.util.Scanner;
public class prog35_passorFail 
{
    public static boolean valid (int num)
    {
        if(num>=0 && num<=100)
        return true;
        else
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int maths,sst,french;

        System.out.print("Enter maths marks :- ");
        maths = sc.nextInt();
        System.out.print("Enter sst marks :- ");
        sst = sc.nextInt();
        System.out.print("Enter french marks :- ");
        french = sc.nextInt();   
        if(valid(maths) && valid(sst) && valid(french))
        {
            float percentage=maths+sst+french/300f;
            if(percentage>=40 && maths>=33 && sst>=33 && french>=33)
            {
                System.out.print("You are pass");
            }
            else
            {
                System.out.print("You are fail");
            }
        }
        else
        {
            System.out.print("Invalid marks enter by the users");
        }
        sc.close();
    }
}
