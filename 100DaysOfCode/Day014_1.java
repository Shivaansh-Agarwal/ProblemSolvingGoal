/*
    https://www.interviewbit.com/problems/noble-integer/
    Time Taken: 28 Minutes
    Date: 16/01/2020
    Author: Shivaansh Agarwal
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size();
        int ans=-1;
        for(int i=0;i<n;i++){
            int num = A.get(i);
            /*  Now this additional loop has to be added just because
                numbers could be repeated in an array.
                Since we only have to count integers which are greater than
                the current integer, we don't have to count integers which is same as the current number and 
                comes after the current integer.
                */
            int j=i+1;
            int count=0;
            while(j<n && num==A.get(j)){
                j++;
                count++;
            }

            if(num==n-(i+1+count)){
                ans = 1;
                break;
            }
        }
        return ans;
    }
}
