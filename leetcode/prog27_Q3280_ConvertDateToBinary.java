/* 
https://leetcode.com/problems/convert-date-to-binary/

You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.

date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.

Return the binary representation of date.

 

Example 1:

Input: date = "2080-02-29"

Output: "100000100000-10-11101"

Explanation:

100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.

Example 2:

Input: date = "1900-01-01"

Output: "11101101100-1-1"

Explanation:

11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 respectively.

 

Constraints:

date.length == 10
date[4] == date[7] == '-', and all other date[i]'s are digits.
The input is generated such that date represents a valid Gregorian calendar date between Jan 1st, 1900 and Dec 31st, 2100 (both inclusive).
*/
package leetcode;

import java.util.Scanner;

public class prog27_Q3280_ConvertDateToBinary {
    public static String convertDateToBinary(String date) {
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return Integer.toBinaryString(year) + "-" +
                Integer.toBinaryString(month) + "-" +
                Integer.toBinaryString(day);
    }
    /*
    public static String convertDateToBinary(String date) {
    String[] p = date.split("-");

    return Integer.toBinaryString(Integer.parseInt(p[0])) + "-" +
           Integer.toBinaryString(Integer.parseInt(p[1])) + "-" +
           Integer.toBinaryString(Integer.parseInt(p[2]));
}
 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a String :- ");
        String num = sc.nextLine();

        System.out.print("Result :- " + convertDateToBinary(num));
        sc.close();
    }
}
