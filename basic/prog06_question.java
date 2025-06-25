//code with harry question
//Write a Program to calculate percentage of a given student in CBSE board exam. 
//His marks from 5 Subjects must be taken as input from the keyboard: (Marks are out of 100).
import java.util.Scanner;
public class prog06_question 
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
        int science,sst,maths,english,french,totalMarks;
        float percentage;
        System.out.print("Enter Science mark :- ");
        science=sc.nextInt();
        System.out.print("Enter SST mark :- ");
        sst=sc.nextInt();
        System.out.print("Enter maths mark :- ");
        maths=sc.nextInt();
        System.out.print("Enter english mark :- ");
        english=sc.nextInt();
        System.out.print("Enter french mark :- ");
        french=sc.nextInt();
        
        if(valid(science) && valid(sst) && valid(maths) && valid(french) && valid(english))
        {
        totalMarks=science+sst+maths+english+french;
        percentage=(totalMarks/500.0f)*100;
        System.out.print("Percentage of student is :- "+percentage+" %");
        }
        else 
        {
            System.out.print("Invalid Input Marks");
        }
        sc.close();
    }
}
