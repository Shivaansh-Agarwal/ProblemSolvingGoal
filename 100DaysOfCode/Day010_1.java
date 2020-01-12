/*
	InterviewBit
	https://www.interviewbit.com/problems/max-non-negative-subarray/
*/
public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        int localStart = -1, globalStart=-1, localEnd=-1, globalEnd=-1;
        long localSum=0, globalSum = -1;
        for(int i=0;i<A.size();i++){
            int num = A.get(i);
            if(num>=0 && localStart<0){
                localStart = i;
            }
            if(num>=0){
                localSum += (long)num;
                localEnd = i;
            }
            if(num<0 || i==A.size()-1){
                if(localSum>globalSum){
                    globalSum=localSum;
                    globalStart = localStart;
                    globalEnd = localEnd;
                }
                localSum = 0;
                localStart = -1;
                localEnd = -1;
            }
        } 
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(globalStart>=0 && globalEnd>=0){
            for(int i=globalStart;i<=globalEnd;i++){
                ans.add(A.get(i));
            }
        }
        return ans;
    }
}
