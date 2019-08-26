class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int temp;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length/2;j++){
                temp = A[i][j];
                A[i][j] = A[i][A[0].length-1-j];
                A[i][A[0].length-1-j] = temp;
                
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(A[i][j]==1)
                    A[i][j] = 0;
                else
                    A[i][j] = 1;
            }
        }
        return A;
    }
}