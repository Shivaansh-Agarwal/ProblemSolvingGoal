/*
    Leetcode Weekly Contest - 176
    1351. Count Negative Numbers in a Sorted Matrix
    https://leetcode.com/contest/weekly-contest-176/problems/count-negative-numbers-in-a-sorted-matrix/

    Date: 16/02/2020
*/

class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=cols-1;j>=0;j--){
                if(grid[i][j]>=0){
                    break;
                }
                count++;
            }
        }
        return count;
    }
}