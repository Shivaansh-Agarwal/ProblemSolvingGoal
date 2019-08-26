class Solution {
    
        public int min(int a, int b){
            if(a>=b)
                return b;
            else
                return a;
        }
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        int max;
        int rowMax[] = new int[grid.length];
        int colMax[] = new int[grid[0].length];
        
        // Finding max of all rows
        for(int i=0;i<grid.length;i++){
            max = grid[i][0];
            for(int j=1;j<grid[0].length;j++){
                if(grid[i][j]>max){
                    max = grid[i][j];
                }
            }
            rowMax[i] = max;
        }
        //System.out.println(Arrays.toString(rowMax));
        
        //Finding max of all columns
        for(int i=0;i<grid[0].length;i++){
            max = grid[0][i];
            for(int j=1;j<grid.length;j++){
                if(grid[j][i]>max){
                    max = grid[j][i];
                }
            }
            colMax[i] = max;
        }
        //System.out.println(Arrays.toString(colMax));
        
        int sumNew = 0;
        int sumOriginal = 0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                sumOriginal += grid[i][j];
                sumNew += min(rowMax[i],colMax[j]);
                //System.out.println(min(rowMax[i],colMax[j]));
            }
        }
        
        return sumNew-sumOriginal;
    }
}