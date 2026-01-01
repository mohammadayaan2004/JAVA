/* 
1   2  3 4 
12 13 14 5 
11 16 15 6 
10  9  8 7
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class prog102_SpiralPattern {
    public List<Integer> spiralOrder(int[][] matrix) {  
        int n=matrix.length;
        int m=matrix[0].length;     
        int top=1,left=1,right=m-1,bottom=n-1;
        List<Integer> ans =new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

             for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;

             for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;    

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = spiralOrder(matrix);
        sc.close();
    }
}

