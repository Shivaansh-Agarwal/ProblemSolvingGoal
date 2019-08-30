/*
Runtime: 1 ms, faster than 97.10% of Java online submissions for Remove Duplicates from Sorted Array.
Memory Usage: 38.3 MB, less than 99.47% of Java online submissions for Remove Duplicates from Sorted Array.
*/
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int lastUnique = nums[0];
        int index = 0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==lastUnique)
                continue;
            else{
                count++;
                lastUnique = nums[i];
                nums[index+1] = lastUnique;
                index += 1;
                continue;
            }
        }
        return count;
    }
}