class Solution {
    public String encode(int num) {
        return Integer.toString(num+1,2).substring(1);
    }
}