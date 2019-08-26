class Solution {
    public boolean detectCapitalUse(String word) {
        boolean ans = true;
        if(word.length()==1){
            ans = true;
        }
        // if First character is small all subsequent characters should be small
        else if(word.charAt(0)>=97){
            for(int i=1;i<word.length();i++){
                if(word.charAt(i)<97){
                    ans = false;
                    break;
                }
            }
        }
        // If the first character is capital
        else{
            // If the second character is also Capital
            if(word.charAt(1)<97){
                for(int i=2;i<word.length();i++){
                    if(word.charAt(i)>=97){
                        ans = false;
                        break;
                    }
                }
            }
            else{
                for(int i=2;i<word.length();i++){
                    if(word.charAt(i)<97){
                        ans = false;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}