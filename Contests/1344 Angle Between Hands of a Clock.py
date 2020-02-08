'''
	1344. Angle Between Hands of a Clock
	https://leetcode.com/contest/biweekly-contest-19/problems/angle-between-hands-of-a-clock/

	Date: 08/02/2020
'''

class Solution:
    def angleClock(self, hour: int, minutes: int) -> float:
        if hour==12:
            hour = 0
        ans = abs((11*minutes)/2-30*hour)
        if ans>180:
            ans = 360-ans
        return ans