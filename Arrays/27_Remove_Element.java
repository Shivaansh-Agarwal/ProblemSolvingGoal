class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0,r=nums.length-1, temp, count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val)
                count++;
        }
        while(l<r){
            if(nums[l]!=val){
                l++;
                continue;
            }
            else if(nums[l]==val){
                if(nums[r]!=val){
                    temp = nums[r];
                    nums[r] = nums[l];
                    nums[l] = temp;
                    l++;
                    r--;
                }
                else{
                    r--;
                    continue;
                }
            }
        }
        return count;
    }
}