public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int temp = A.get(i);
            if(hs.contains(temp)){
                ans.add(temp);
            } else {
                hs.add(temp);
            }
        }
        for(int i=1;i<=n;i++){
            if(hs.contains(i)){
                continue;
            } else {
                ans.add(i);
                break;
            }
        }
        return ans;
    }
}
