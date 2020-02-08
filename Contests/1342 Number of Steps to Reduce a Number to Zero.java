/*
	1342. Number of Steps to Reduce a Number to Zero
	https://leetcode.com/contest/biweekly-contest-19/problems/number-of-steps-to-reduce-a-number-to-zero/

	Date: 08/02/2020
*/

class Solution {
    public int numberOfSteps (int num) {
        if(num==0)
            return 0;
        else if(num%2==0)
            return 1+numberOfSteps(num/2);
        else
            return 1+numberOfSteps(num-1);
    }
}