/*
    1232. Check If It Is a Straight Line
    https://leetcode.com/problems/check-if-it-is-a-straight-line/
    08/05/2020
    May LeetCoding Challenge
    Day-8
*/

class Solution {
    public double findSlope(int x1, int y1, int x2, int y2){
        return ((double)(y2 - y1)/(double)(x2 - x1));
    }
    public boolean checkStraightLine(int[][] coordinates) {
        boolean isStraightLine = true;
        double slope = findSlope(coordinates[0][0],coordinates[0][1],coordinates[1][0],coordinates[1][1]);
        for(int i=1; i<coordinates.length-1; i++){
            double newSlope = findSlope(coordinates[i][0], coordinates[i][1], coordinates[i+1][0], coordinates[i+1][1]);
            if(slope != newSlope){
                isStraightLine = false;
                break;
            }
        }
        return isStraightLine;
    }
}