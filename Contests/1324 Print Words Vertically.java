/*
    Leetcode
    https://leetcode.com/contest/weekly-contest-172/problems/print-words-vertically/
    1324. Print Words Vertically
*/

class Solution {
    public List<String> printVertically(String s) {
        String arr[] = s.split(" ");
        int len = arr.length;
        int maxLen = arr[0].length();
        for(int i=1;i<len;i++){
            int temp = arr[i].length();
            maxLen = temp>maxLen ? temp : maxLen;
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<maxLen;i++){
            String temp1="";
            for(int j=0;j<len;j++){
                if(arr[j].length()>i)
                    temp1 += arr[j].charAt(i);
                else 
                    temp1 += " ";
            }
            ans.add(temp1.replaceFirst("\\s+$",""));
        }
        return ans;
    }
}