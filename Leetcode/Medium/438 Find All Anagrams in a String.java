/*
    438. Find All Anagrams in a String (Medium)
    https://leetcode.com/problems/find-all-anagrams-in-a-string/
    17/05/2020
    May LeetCoding Challenge
    Day-17
*/

class Solution {
    public boolean isAnagram(int p_arr[], int s_arr[]){
        for(int i=0;i<26;i++){
            if(p_arr[i]!=s_arr[i])
                return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int len_p = p.length();
        int len_s = s.length();
        if(len_p==0 || len_s==0 || len_s < len_p)
            return ans;
        int p_arr[] = new int[26];
        for(int i=0;i<len_p;i++){
            p_arr[p.charAt(i)-'a']++;
        }
        int s_arr[] = new int[26];
        for(int i=0;i<len_p;i++){
            s_arr[s.charAt(i)-'a']++;
        }
        if(isAnagram(p_arr, s_arr))
            ans.add(0);
        for(int i=1;i<=len_s-len_p;i++){
            s_arr[s.charAt(i-1)-'a']--;
            s_arr[s.charAt(i+len_p-1)-'a']++;
            if(isAnagram(p_arr, s_arr))
                ans.add(i);
        }
        return ans;
    }
}