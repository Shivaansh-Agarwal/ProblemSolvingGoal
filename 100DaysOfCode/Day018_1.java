public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        int n = A.size();
        int ans=0;
        if(n!=1){
            List<Integer> minArray = new ArrayList<Integer>();
            minArray.add(0);
            int localMin = A.get(0);
            int index = 0;
            for(int i=1;i<n;i++){
                if(localMin>A.get(i)){
                    localMin = A.get(i);
                    index = i;
                } 
                minArray.add(index);
            }
            List<Integer> maxArray = new ArrayList<Integer>();
            maxArray.add(n-1);
            int localMax = A.get(n-1);
            index = n-1;
            for(int i=n-2;i>=0;i--){
                if(localMax<=A.get(i)){
                    localMax = A.get(i);
                    index = i;
                }
                maxArray.add(index);
            }
            Collections.reverse(maxArray);
            int gap = -1;
            int i=0,j=0;
            while(i<n && j<n){
                int mini = minArray.get(i);
                int maxj = maxArray.get(j);
                if(mini<=maxj && A.get(mini)<=A.get(maxj)){
                    j+=1;
                    gap = Math.max(gap,maxj-mini);
                } else {
                    i+=1;
                }
            }
            ans = gap!=-1 ? gap : 0;
        }
        return ans;
    }
}
