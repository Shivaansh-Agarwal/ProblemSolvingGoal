/*
    https://leetcode.com/problems/first-bad-version/
    01/05/2020
    May LeetCoding Challenge
    Day-1
*/

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start=1, end=n;
        while(start < end){
            int mid = start + (end-start)/2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }
}