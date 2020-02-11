/*
    1313. Decompress Run-Length Encoded List
    https://leetcode.com/problems/decompress-run-length-encoded-list/

    Date: 11/02/2020
*/

class Solution {
    public int[] decompressRLElist(int[] nums) {
        /* First I'll calculate the size of the array which I've to return, by 
            summing all the elements at even index which denotes the frequency.
        */
        int n = nums.length;
        int size=0;
        for(int i=0;i<n;i+=2)
            size+=nums[i];
        int ans[] = new int[size];
        int k=0;
        for(int i=0;i<n;i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0;j<freq;j++){
                ans[k] = val;
                k++;
            }
        }
        return ans;
    }
}