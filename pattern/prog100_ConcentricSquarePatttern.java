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
        int size=2*n-1,start=1,end=size;
        int arr[][]=new int[size][size];
        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                if(i==start || i==end || j==start || j==end) {
                    arr[i][j]=n;
                }               
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

