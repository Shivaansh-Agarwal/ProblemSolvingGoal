/*
    Leetcode Weekly Contest

    1346. Check If N and Its Double Exist
    https://leetcode.com/contest/weekly-contest-175/problems/check-if-n-and-its-double-exist/

    Date: 09/02/2020
*/

class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        boolean ans = false;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]%2==0 && (arr[i]/2 == arr[j])) || (arr[i]*2==arr[j])){
                    ans = true;
                    System.out.println(arr[i] + "" + arr[j]);
                    break;
                }
            }
            if(ans)
                break;
        }
        return ans;
    }
}