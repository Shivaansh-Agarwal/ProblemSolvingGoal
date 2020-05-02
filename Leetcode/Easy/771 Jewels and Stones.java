/*
    https://leetcode.com/problems/jewels-and-stones/
    02/05/2020
    May LeetCoding Challenge
    Day-2
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
        Boolean jewels[] = new Boolean[256];
        Arrays.fill(jewels,false);
        for(int i=0;i<J.length();i++)
            jewels[(int)J.charAt(i)] = true;
        int count = 0;
        for(int j=0;j<S.length();j++){
            if(jewels[(int)S.charAt(j)]) count++;
        }
        return count;
    }
}