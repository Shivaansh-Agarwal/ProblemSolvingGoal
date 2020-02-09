/*
    Leetcode Weekly Contest

    1347. Minimum Number of Steps to Make Two Strings Anagram
    https://leetcode.com/contest/weekly-contest-175/problems/minimum-number-of-steps-to-make-two-strings-anagram/

    Date: 09/02/2020
*/

class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        int countS[] = new int[26];
        int countT[] = new int[26];
        for(int i=0;i<n;i++){
            char ch_s = s.charAt(i);
            countS[ch_s-97]+=1;
            char ch_t = t.charAt(i);
            countT[ch_t-97]+=1;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            if(countT[i]>countS[i]){
                ans += countT[i]-countS[i];
            }
        }
        return ans;
    }
}