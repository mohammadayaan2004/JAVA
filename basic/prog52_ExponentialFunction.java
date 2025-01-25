import java.util.Scanner;
public class prog52_ExponentialFunction {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Please Enter a Base Number :- ");
    int num1=sc.nextInt();  //5  
    System.out.print("Please Enter a Exponential Number :- ");
    int num2=sc.nextInt();  //3
    int power=1;
    for(int i=1;i<=num2;i++){
        power*=num1;
    }   
    System.out.print(power);
    sc.close();
    }
}
