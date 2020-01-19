/*
    Leetcode
    https://leetcode.com/contest/weekly-contest-172/problems/maximum-69-number/
    1323. Maximum 69 Number
*/

class Solution {
    public int maximum69Number (int num) {
        String numString = Integer.toString(num);
        if(!numString.contains("6")){
            return num;
        }
        int n = numString.length();
        String ans = "";
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(numString.charAt(i) == '6'){
                flag = true;
                ans = numString.substring(0,i)+"9"+numString.substring(i+1,n);
                break;
            }
        }
        int finalAns = Integer.parseInt(ans);
        return finalAns;
    }
}