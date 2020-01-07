/*
    Min Steps in Infinite Grid (InterviewBit)
    https://www.interviewbit.com/problems/min-steps-in-infinite-grid/
    
    Problem: You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.

    Input : [(0, 0), (1, 1), (1, 2)]
    Output : 2

    Approach: 
    So here we just have to find the Absolute Difference between 2 consecutive x and y coordinates -> select the maximum from them -> add it to the main answer

*/

public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int n = A.size();
        if(n==1)
            return 0;
        int x = A.get(0);
        int y = B.get(0);
        int sum = 0, x_sum,y_sum;
        for(int i=1;i<n;i++){
            x_sum = A.get(i)-x;
            if(x_sum<0)
                x_sum*=-1;
            y_sum = B.get(i)-y;
            if(y_sum<0)
                y_sum*=-1;
            sum = sum+Math.max(x_sum,y_sum);
            x = A.get(i);
            y = B.get(i);
        }
        return sum;
    }
}
