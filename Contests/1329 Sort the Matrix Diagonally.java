/*
    1329 Sort the Matrix Diagonally
    https://leetcode.com/contest/biweekly-contest-18/problems/sort-the-matrix-diagonally/
    Date: 26-01-2020
*/

class Solution {
    
    /**
     *  Method used for sorting elements of a single diagonal
     */
    public ArrayList<Integer> sortingSingleDiagonal(int mat[][], int row, int col){
        int m = mat.length;
        int n = mat[0].length;
        ArrayList<Integer> arr = new ArrayList<>();
        while(row<m && col<n){
            arr.add(mat[row][col]);
            row++;
            col++;
        }
        Collections.sort(arr);
        return arr;
    }
    
    /**
     *  Method used for modifying the original 2D Matrix by storing the sorted elements.
     */
    public int[][] modifyMatrix(int mat[][], int row, int col, List<Integer> arr){
        int m = mat.length;
        int n = mat[0].length;
        int temp = 0;
        while(row<m && col<n){
            mat[row][col] = arr.get(temp);
            temp++;
            row++;
            col++;
        }
        return mat;
    }
    
    /**
     *  Main Method for Sorting Matrix Diagonally
     */
    public int[][] diagonalSort(int[][] mat) {
        int row,col;
        int m = mat.length;     // Number of rows
        int n = mat[0].length;  // Number of columns
        for(int j=0;j<n;j++){
            row = 0;
            col = j;
            ArrayList<Integer> arr = this.sortingSingleDiagonal(mat,row,col);
            mat = this.modifyMatrix(mat, row, col, arr);
        }
        for(int i=1;i<m;i++){
            row = i;
            col = 0;
            ArrayList<Integer> arr = this.sortingSingleDiagonal(mat,row,col);
            mat = this.modifyMatrix(mat, row, col, arr);
        }
        return mat;
    }

}