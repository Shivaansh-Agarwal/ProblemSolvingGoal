/*
	1295. Find Numbers with Even Number of Digits
	https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

	Date: 12-02-2020
*/

class Solution {
    public int findNumbers(int[] nums) {
        int count=0;       
        for(int num : nums){
            if((num>=10 && num<=99) || (num>=1000 && num<=9999))
                count++;
            //count += ((int)(Math.log10((double)num)) + 1)%2==0 ? 1 : 0;
        }
        return count;
    }
}