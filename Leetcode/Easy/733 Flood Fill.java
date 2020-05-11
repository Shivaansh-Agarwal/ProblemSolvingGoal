/*
    733. Flood Fill
    https://leetcode.com/problems/flood-fill/
    11/05/2020
    May LeetCoding Challenge
    Day-11
*/

class Solution {
    public int[][] dropFill(int [][] image, int row, int col, int origColor, int newColor){
        image[row][col] = newColor;
        boolean north=false, south=false, east=false, west=false;
        if(row-1>=0 && image[row-1][col]==origColor)
            north = true;
        if(row+1<image.length && image[row+1][col]==origColor)
            south = true;
        if(col-1>=0 && image[row][col-1]==origColor)
            west = true;
        if(col+1<image[0].length && image[row][col+1]==origColor)
            east = true;
        if(!(north || south || east || west))
            return image;
        else {
            if(north){
                image[row-1][col] = newColor;
                image = dropFill(image, row-1, col, origColor, newColor);
            }
            if(south){
                image[row+1][col] = newColor;
                image = dropFill(image, row+1, col, origColor, newColor);
            }
            if(east){
                image[row][col+1] = newColor;
                image = dropFill(image, row, col+1, origColor, newColor);
            }
            if(west){
                image[row][col-1] = newColor;
                image = dropFill(image, row, col-1, origColor, newColor);
            }
            return image;
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        // Edge case when original Color == newColor
        if(image[sr][sc]==newColor)
            return image;
        return dropFill(image, sr, sc, image[sr][sc], newColor);
    }
}