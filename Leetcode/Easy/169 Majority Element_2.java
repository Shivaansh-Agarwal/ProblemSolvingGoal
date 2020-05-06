/*
    169. Majority Element O(nlogn)
    https://leetcode.com/problems/majority-element/
    06/05/2020
    May LeetCoding Challenge
    Day-6
*/

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majorityElement = nums[nums.length/2];
        return majorityElement;
    }
}