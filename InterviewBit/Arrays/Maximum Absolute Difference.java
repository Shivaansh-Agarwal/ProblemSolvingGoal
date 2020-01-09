//https://www.interviewbit.com/problems/maximum-absolute-difference/

public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        /*
        O(n^2) Approach
        int globalMaxAbsDiff = 0; //|A[0]-A[0]|+|0-0|
        int localMaxAbsDiff;
        for(int i=0;i<A.size()-1;i++){
            for(int j=i+1;j<A.size();j++){
                localMaxAbsDiff = Math.abs(A.get(i)-A.get(j))+Math.abs(i-j);
                if(localMaxAbsDiff > globalMaxAbsDiff)
                    globalMaxAbsDiff = localMaxAbsDiff;
            }
        }
        return globalMaxAbsDiff;
        */
        
        /*===================================================*/
        //O(n) Approach
        /*
            f(i,j)=|A[i]-A[j]|+|i-j|
            
            max1 = A[i]+i
            min1 = A[i]+i (A[j]+j)
            max2 = A[i]-i
            min2 = A[i]-i
        */
        int max1=Integer.MIN_VALUE, min1=Integer.MAX_VALUE;
        int max2=Integer.MIN_VALUE, min2=Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            max1 = Math.max(max1,A.get(i)+i);
            min1 = Math.min(min1,A.get(i)+i);
            max2 = Math.max(max2,A.get(i)-i);
            min2 = Math.min(min2,A.get(i)-i);
        }
        int ans = Math.max(max1-min1,max2-min2);
        return ans;
    }
}