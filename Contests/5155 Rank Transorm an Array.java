import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] duplicate = new int[n];
        for(int i=0;i<n;i++)
            duplicate[i] = arr[i];
        Arrays.sort(duplicate);
        Map<Integer,Integer> hmap = new HashMap<>();
        int rank = 1;
        for(int i=0;i<n;i++){
            if(hmap.containsKey(duplicate[i]))
                continue;
            else {
                hmap.put(duplicate[i],rank);
                rank++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = hmap.get(arr[i]);
        }
        return arr;
    }
}