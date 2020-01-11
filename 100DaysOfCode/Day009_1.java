/*
    https://www.interviewbit.com/problems/flip/
    InterviewBit

    Approach
    Earlier I was thinking of solving this problem by using the brute force approach that is by using mutiple for loops and then checking how many 1's are there in each subarray
    and then finally 
    returning the subarray having maximum number of 0's which could then be converted into 1's or 
    returning the subarray having maximum number of 1's.
    
    BUT after going through the commments section I got to know that,
    This problem could easily be converted to the Maximum Subarray Problem (Kadane's Algorithm), with just a bit of changes.

    Note what is the net change in number of 1s in string S when we flip bits of string S.
    Say it has A 0s and B 1s. Eventually, there are B 0s and A 1s.
    So, number of 1s increase by A - B. We want to choose a subarray which maximises this. 
    Note, if we change 1s to -1, then sum of values will give us A - B. Then, we have to find a subarray with maximum sum, which can be done via Kadane’s Algorithm.
    So we've to convert the array of 0's and 1's into an array of 1's and -1's.
*/

public class Solution {
    public ArrayList<Integer> flip(String A) {
        int n = A.length();
        /*  Created an array of size n so that we could use it to apply the Kadane's Algorithm
            
        */
        int arr1[] = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='1'){
                arr1[i]=-1;
                count++;
            } else {
                arr1[i]=1;
            }
        }
        /*  This ans ArrayList will be used to return the answer.
            If all elements are 1 we'll return an empty ArrayList
            else we'll return the ArrayList by storing the left and right indices of the subarray
        */
        ArrayList<Integer> ans = new ArrayList<>();
        if(count==n){
        } else {
            // Applying Kadane's Algorithm 
            int maxSoFar = arr1[0];
            int maxEndingHere = arr1[0];
            int local_L=0,local_R=0,L=0,R=0;    //used for storing the left and right indices of the subarray.
            for(int i=1;i<n;i++){
                if(arr1[i]>(arr1[i]+maxEndingHere)){
                    maxEndingHere = arr1[i];
                    local_L=i;
                    local_R=i;
                } else {
                    maxEndingHere = arr1[i]+maxEndingHere;
                    local_R=i;
                }
                if(maxEndingHere>maxSoFar){
                    maxSoFar = maxEndingHere;
                    L = local_L;
                    R = local_R;
                } else {
                    maxSoFar = maxSoFar;
                }
            }
            // Since the question's requirement is that indices start from 1, I've added 1 to the left and right indices.
            ans.add(L+1);
            ans.add(R+1);
        }
        return ans;
    }
}
