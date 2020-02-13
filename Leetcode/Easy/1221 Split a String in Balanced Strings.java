/*
	1221. Split a String in Balanced Strings
	https://leetcode.com/problems/split-a-string-in-balanced-strings/

	Date: 13/02/2020
*/

class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int temp = 0;
        int ans = 0;
        for(int i=0;i<n;i++){
            temp += s.charAt(i)=='R' ? 1 : -1;
            ans += temp==0 ? 1 : 0;
        }
        return ans;
    }
}