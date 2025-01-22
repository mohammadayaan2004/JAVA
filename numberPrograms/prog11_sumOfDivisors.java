/* 
https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
https://www.naukri.com/code360/problems/sum-of-all-divisors_8360720
 Problem statement
You are given an integer ‘n’.

Function ‘sumOfDivisors(n)’ is defined as the sum of all divisors of ‘n’.

Find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to ‘n’.

Example:
Input: ‘n’  = 5

Output: 21

Explanation:
We need to find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to 5. 
‘sumOfDivisors(1)’ = 1
‘sumOfDivisors(2)’ = 2 + 1 = 3
‘sumOfDivisors(3)’ = 3 + 1 = 4
‘sumOfDivisors(4)’ = 4 + 2 +1 = 7 
‘sumOfDivisors(5)’ = 5 + 1 = 6
Therefore our answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) + sumOfDivisors(4) + sumOfDivisors(5) = 1 + 3 + 4 + 7 + 6 = 21.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
3

Sample Output 1:
8

Explanation of sample output 1:
We need to find sumOfDivisors(1) + sumOfDivisors(2) +sumOfDivisors(3).
sumOfDivisors(1) = 1
sumOfDivisors(2) = 2 + 1 = 3
sumOfDivisors(3) = 3 + 1 = 4
Therefore, the answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) = 1 + 3 + 4 = 8. 


Sample Input 2:
10


Sample Output 2:
87


Expected Time Complexity:
Try to solve this in O(sqrt(‘n’)).


Constraints:
1 <= ‘n’ <= 3*10^4

Time Limit: 1 sec
 */
package numberPrograms;
import java.util.Scanner;
    public class prog11_sumOfDivisors 
    {
        public static int sumOfAllDivisors(int n)
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            {
               sum+=(n/i)*i;
            }
            return sum;
        }
        public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int n=sc.nextInt();
        System.out.println(sumOfAllDivisors(n));
        sc.close();
        }
    }
    
