//write a Java program to encrypt a grade 
//by adding 8 to it and then decrypt it to show the original grade.
import java.util.Scanner;
public class prog28_encryptDecrypt{
    public static boolean valid(char name){
        return ((name>='A' && name<='F') ||(name>='a' && name<='f'));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.print("Enter a grade :- ");
        grade=sc.next().charAt(0);
        if(valid(grade)){
        char encryptedGrade =(char) (grade + 8);
        char decryptedGrade =(char) (encryptedGrade-8);
        System.out.println("Encrypted grade is :- "+encryptedGrade);
        System.out.println("Decrypted grade is :- "+decryptedGrade);
        }
        else{
            System.out.print("Invalid grade");
        }
        sc.close();
    }
}