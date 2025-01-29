/*
https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

 

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
 

Constraints:

1 <= sentence.length <= 1000
sentence consists of lowercase English letters.
 */
package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Q1832_CheckifSentenceISPragram{
    public static boolean checkIfPangram(String s) {
        Set<Character> set =new HashSet<>();
        for(int i=1;i<=s.length();i++)
        {
            set.add(s.charAt(i));
        }
        return set.size()==26;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number :- ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(checkIfPangram(n)){
            System.out.println("Is a pragram");
        }
        else{
            System.out.println("Is not a pragram");

        }
        sc.close();
    }
}