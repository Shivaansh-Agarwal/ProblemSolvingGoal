/*
    567. Permutation in String (Medium)
    https://leetcode.com/problems/permutation-in-string/
    18/05/2020
    May LeetCoding Challenge
    Day-18
*/

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1_len = s1.length();
        int s2_len = s2.length();
        if(s1_len>s2_len || s1_len==0 || s2_len==0)
            return false;
        int arr_s1[] = new int[26];
        int arr_s2[] = new int[26];
        for(int i=0;i<s1_len;i++){
            arr_s1[s1.charAt(i)-'a']++;
            arr_s2[s2.charAt(i)-'a']++;
        }
        boolean ans=true;
        for(int i=0;i<s1_len;i++){
            int index = s2.charAt(i)-'a';
            if(arr_s1[index]==arr_s2[index]){
                continue;
            } else {
                ans = false;
                break;
            }
        }
        if(ans)
            return ans;
        for(int i=1;i<=s2_len-s1_len;i++){
            ans = true;
            arr_s2[s2.charAt(i-1)-'a']--;
            arr_s2[s2.charAt(i+s1_len-1)-'a']++;
            for(int j=0;j<26;j++){
                if(arr_s1[j]==arr_s2[j]){
                    ans = true;
                    continue;
                } else {
                    ans = false;
                    break;
                }
            }
            if(ans){
                break;
            }
        }
        return ans;
    }
}