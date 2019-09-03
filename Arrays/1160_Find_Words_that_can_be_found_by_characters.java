class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] strCharsCount = new int[26];
        int ans = 0;
        for(int i=0;i<chars.length();i++){
            strCharsCount[chars.charAt(i)-97]+=1;
        }
        //System.out.println(Arrays.toString(strCharsCount));
        for(int i=0;i<words.length;i++){
            int[] wordCharCount = new int[26];
            for(int j=0;j<words[i].length();j++){
                wordCharCount[words[i].charAt(j)-97]+=1;
            }
            //System.out.println(Arrays.toString(wordCharCount));
            boolean temp = true;
            for(int k=0;k<26;k++){
                //System.out.println(wordCharCount[k] + " " +strCharsCount[k]);
                if(wordCharCount[k]<=strCharsCount[k]){
                    temp = true;
                    continue;
                }           
                else{
                    temp = false;
                    break;
                }
            }
            if(temp==true){
                ans += words[i].length();
                //System.out.println(ans);
            }
        }
        return ans;
    }
}