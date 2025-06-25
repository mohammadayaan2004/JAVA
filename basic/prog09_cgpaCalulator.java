import java.util.Scanner;
public class prog09_cgpaCalulator {
    public static boolean valid (int num){
        if(num>=0 && num<=100)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int science,sst,maths,english,french,totalMarks;
        float percentage,cgpa;
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
            cgpa=percentage/9.5f;    
            System.out.print("Percentage of student is :- "+percentage+" %");
            System.out.println("\nCGPA:- "+cgpa);
        }
        else 
        {
            System.out.print("Invalid Input Marks");
        }
        sc.close();
    }    
}    
