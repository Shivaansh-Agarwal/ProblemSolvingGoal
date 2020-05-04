/*
	1009. Complement of Base 10 Integer
	https://leetcode.com/problems/complement-of-base-10-integer/
	04/05/2020
	May LeetCoding Challenge
    Day-4
*/

class Solution {
    public int findComplement(int num) {
        // Find number of bits in 'num'
        int numberOfBits = (int)Math.floor(Math.log10((double)num)/Math.log10((double)2)) + 1;
        
        // Maximum Number of var='numberOfBits'
        long maxNumOfNBits = (long)Math.pow(2,numberOfBits) - 1;
        
        int bitwiseComplement = (int)(maxNumOfNBits^(long)num);
        return bitwiseComplement;
    }
}