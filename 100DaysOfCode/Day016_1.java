/*
    https://www.interviewbit.com/problems/wave-array/
    Author: Shivaansh Agarwal
*/

public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        int n = A.size()%2==0 ? A.size() : A.size()-1;
        for(int i=1;i<n;i+=2){
            int temp = A.get(i);
            A.set(i,A.get(i-1));
            A.set(i-1,temp);
        }
        return A;
    }
}
