// https://www.interviewbit.com/problems/max-sum-contiguous-subarray/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int maxAtThisPoint=A.get(0), maxUptilNow=A.get(0);
        for(int i=1;i<A.size();i++){
            maxAtThisPoint = Math.max(A.get(i),A.get(i)+maxAtThisPoint);
            maxUptilNow = Math.max(maxAtThisPoint,maxUptilNow);
        }
        return maxUptilNow;
    }
}