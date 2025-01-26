class Solution {
    public static boolean isPalindrome(int n) {
        int temp=n,lastdigit,reverse=0;
        while(n>0){
            lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n/=10;
        }
        if(temp==reverse){return true;}
        else {return false;}
    }
}