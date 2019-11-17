class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m  = grid[0].length;
        int newGrid[][] = new int[n][m];
        for(int p=0;p<k;p++){
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                arr.add(grid[i][m-1]);
            }
            for(int j=m-2;j>=0;j--){
                for(int i=0;i<n;i++){
                    grid[i][j+1] = grid[i][j];
                }
            }
            /*
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println("");
            }*/
            for(int i=0;i<n-1;i++){
                grid[i+1][0] = arr.get(i);
            }
            grid[0][0] = arr.get(n-1);
        }
        List<List<Integer>> finalArray = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            List<Integer> tempArray= new ArrayList<Integer>();
            for(int j=0;j<m;j++){
                tempArray.add(grid[i][j]);
            }
            finalArray.add(tempArray);
        }
        return finalArray;
    }
}