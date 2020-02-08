/*
    1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
    https://leetcode.com/contest/biweekly-contest-19/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/

    Date: 08/02/2020
*/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int sum = 0;
        int noOfSubarrays = 0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        if((sum/k)>=threshold)
            noOfSubarrays+=1;
        if(k==n)
            return noOfSubarrays;
        for(int i=1;i<=n-k;i++){
            //if(arr[i-1]==arr[i+k-1])
                //continue;
            sum = sum - arr[i-1] + arr[i+k-1];
            if((sum/k)>=threshold){
                noOfSubarrays+=1;
            }
        }
        return noOfSubarrays;
    }
}