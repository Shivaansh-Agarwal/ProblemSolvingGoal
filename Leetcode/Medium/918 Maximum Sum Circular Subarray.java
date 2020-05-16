/*
    https://leetcode.com/problems/maximum-sum-circular-subarray/
    918. Maximum Sum Circular Subarray (Medium)
    15/05/2020
    May LeetCoding Challenge
    Day-15
*/

class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length;
        int currSum = 0, bestSum = Integer.MIN_VALUE;
        int totalSum = 0;
        int currSumWrap = 0, bestSumWrap = Integer.MIN_VALUE;
        int negCount = 0, minimum = Integer.MIN_VALUE; // Handling Edge Case
        for(int i=0; i<n; i++){
            negCount = (A[i]<0) ? (negCount+1) : negCount;
            minimum = Math.max(minimum, A[i]);
            
            currSum = Math.max(A[i], currSum+A[i]);
            bestSum = Math.max(currSum, bestSum);
            
            totalSum += A[i];
            A[i] *= -1;
            currSumWrap = Math.max(A[i], currSumWrap+A[i]);
            bestSumWrap = Math.max(currSumWrap, bestSumWrap);
        }
        if(negCount==n)
            return minimum;
        else
            return Math.max(bestSum, totalSum + bestSumWrap);
    }
}