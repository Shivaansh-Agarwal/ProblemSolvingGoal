/*
    1332. Remove Palindromic Subsequences
    https://leetcode.com/contest/weekly-contest-173/problems/remove-palindromic-subsequences/
    26-01-2020
*/

class Solution {
    public int removePalindromeSub(String str) {
        int n = str.length();
        String strRev = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = strRev.equals(str);
        if(n==0)
            return 0;
        else if(n==1 || isPalindrome)
            return 1;
        else
            return 2;
    }
}