/*
https://www.geeksforgeeks.org/problems/squares-in-nn-chessboard1801/0

Squares in N*N Chessboard

Find the total number of Squares in a N*N chessboard.

Example 1:

Input:
N = 1
Output:
1
Explanation:
A 1*1 chessboard has only 1 square.
Example 2:

Input:
N = 2
Output: 5
Explanation:
A 2*2 chessboard has 5 squares.
4 1*1 squares and a 2*2 square.
 

Your Task:
You don't need to read input or print anything. Your task is to 
complete the function squaresInChessBoard() which takes an Integer N as 
input and returns the number of squares in a N*N chessboard.

 Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 10^5
*/
package GFG;
import java.util.Scanner;
public class prog27_SquaresInNmutipyNChessboard {
    public static Long squaresInChessBoard(Long N){
        long sum = 0;
        for(long i=1;i<=N;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :- ");
        Long n = sc.nextLong();
        System.out.print("Result :- " + squaresInChessBoard(n));
        sc.close();
    }
}
