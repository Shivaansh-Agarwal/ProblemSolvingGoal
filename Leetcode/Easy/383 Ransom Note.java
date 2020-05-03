/*
	https://leetcode.com/problems/ransom-note/
	03/05/2020
	May LeetCoding Challenge
    Day-3
*/

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int random[] = new int[26];
        int mag[] = new int[26];
        for(int i=0;i<ransomNote.length();i++){
            random[ransomNote.charAt(i)-97]++;
        }
        for(int j=0;j<magazine.length();j++){
            mag[magazine.charAt(j)-97]++;
        }
        boolean ans = true;
        for(int k=0;k<26;k++){
            if(random[k]>mag[k]){
                ans = false;
                break;
            }
        }
        return ans;
    }
}