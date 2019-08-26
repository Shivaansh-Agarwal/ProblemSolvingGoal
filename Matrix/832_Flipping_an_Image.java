class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int temp;
        int noCol = A[0].length;
        for(int[] row : A){
            for(int j=0; j<(noCol+1)/2 ;j++){
                temp = row[j] ^ 1;
                row[j] = row[noCol-1-j] ^ 1;
                row[noCol-1-j] = temp;
            }
        }
        return A;
    }
}