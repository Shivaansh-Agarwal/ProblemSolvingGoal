// 5151 Break a Palindrome
class Solution {
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        String ans = "";
        if(n==1)
            return ans;
        int count = 0;
        if(palindrome.charAt(0)=='a'){
            count = 1;
            for(int i=1;i<n;i++){
                if(palindrome.charAt(i)=='a'){
                    count++;
                }
            }
            if(count==n){
                ans = palindrome.substring(0,n-1) + "b";
                return ans;
            }
        }
        for(int i=0;i<n;i++){
            if(palindrome.charAt(i)!='a' && count!=n-1){
                ans = palindrome.substring(0,i) + "a" + palindrome.substring(i+1,n);
                break;
            } else if(count == n-1){
                ans = palindrome.substring(0,n-1) + "b";
            }
        }
        return ans;
    }
}