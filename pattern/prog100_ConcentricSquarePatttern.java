/*
https://www.naukri.com/code360/problems/ninja-and-the-number-pattern-i_6581959
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/
import java.util.Scanner;
public class prog100_ConcentricSquarePatttern {
    public static void nForest(int n)
    {
        int size=2*n-1;
        for (int i = 1; i <= size ; i++) {
            for (int j = 1; j <= size ; j++) {
                int top=i-1,left=j-1,right=size-j,down=size-i;
                int num=n-Math.min(Math.min(top,down),Math.min(right,left));
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Number of rows :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nForest(n);
        sc.close();
    }
}

