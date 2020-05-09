/*
    367. Valid Perfect Square
    https://leetcode.com/problems/valid-perfect-square/
    09/05/2020
    May LeetCoding Challenge
    Day-9
*/

class Solution {
    public boolean isPerfectSquare(int num) {
        // All perfect squares end with 0,1,4,5,6,9 therefore any number that ends with 2,3,7,8 is not a perfect square
        List<Integer> notPerfSquares = Arrays.asList(2,3,7,8);
        if(notPerfSquares.contains(num%10))
            return false;
        // Newton Method
        int i=1;
        while(i*i < num){
            i++;
        }
        return i*i==num;
    }
}