class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int rowseen[] = new int[n];
        int colseen[] = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    rowseen[i]+=1;
                    colseen[j]+=1;
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    if(rowseen[i]>1 || colseen[j]>1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}