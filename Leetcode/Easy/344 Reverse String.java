/*
    344. Reverse String
    https://leetcode.com/problems/reverse-string/
    Day-4
    June Leetcoding Challenge
*/

class Solution {
    public void reverseString(char[] s) {
        int low=0, high=s.length-1;
        while(low<high){
            char ch = s[low];
            s[low] = s[high];
            s[high] = ch;
            low++;
            high--;
        }
    }
}