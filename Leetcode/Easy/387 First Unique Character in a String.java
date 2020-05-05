/*
    387. First Unique Character in a String
    https://leetcode.com/problems/first-unique-character-in-a-string/
    05/05/2020
    May LeetCoding Challenge
    Day-5
*/

class Solution {
    public int firstUniqChar(String s) {
        int charCount[] = new int[26];
        Arrays.fill(charCount,0);
        for(int i=0;i<s.length();i++){
            charCount[s.charAt(i)-'a']++;
        }
        int nonRepeatingCharIndex = -1;
        for(int i=0;i<s.length();i++){
            if(charCount[s.charAt(i)-'a']==1){
                nonRepeatingCharIndex = i;
                break;
            }
        }
        return nonRepeatingCharIndex;
    }
}