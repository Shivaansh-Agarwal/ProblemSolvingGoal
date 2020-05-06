/*
    169. Majority Element O(n^2)
    https://leetcode.com/problems/majority-element/
    06/05/2020
    May LeetCoding Challenge
    Day-6
*/

class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for(Integer num : nums){
            hmap.put(num, hmap.getOrDefault(num,0)+1);
        }
        int threshold = (int)Math.floor(nums.length/2);
        int majorityElement = -1;
        for(Integer key: hmap.keySet()){
            if(hmap.get(key) > threshold){
                majorityElement = key;
                break;
            }
        }
        return majorityElement;
    }
}