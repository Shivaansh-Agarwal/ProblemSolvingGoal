/*
    169. Majority Element O(n)
    https://leetcode.com/problems/majority-element/
    06/05/2020
    May LeetCoding Challenge
    Day-6
*/

class Solution {
    public int majorityElement(int[] nums) {
        int countDiff = 0;
        int majElem = -Integer.MIN_VALUE;
        for(int num : nums){
            if(countDiff==0){
                majElem = num;
                countDiff++;
            } else if(majElem==num) {
                countDiff++;
            } else if(majElem!=num) {
                countDiff--;
            }
        }
        return majElem;
    }
}