/*
	Leetcode Weekly Contest-174
	Date: 02/02/2020
	
	1341. The K Weakest Rows in a Matrix
		https://leetcode.com/contest/weekly-contest-174/problems/the-k-weakest-rows-in-a-matrix/
*/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        Integer arr[] = new Integer[m];
        int ans[] = new int[k];
        //Arrays.fill(arr,0);
        for(int i=0;i<m;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                }
            }
            arr[i] = count;
        }
        int t=0;
        for(int i=0;i<m;i++){
            int min = arr[0];
            int index = 0;
            for(int j=1;j<m;j++){
                if(arr[j]<min){
                    min = arr[j];
                    index = j;
                }
            }
            if(t<k){
                ans[t] = index;
                t++;
                arr[index] = Integer.MAX_VALUE;
            } else {
                break;
            }
        }
        return ans;
    }
}