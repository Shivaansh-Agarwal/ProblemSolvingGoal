class Solution {
    public int findLengthOfLCIS(int[] arr) {
        if(arr.length==0)
            return 0;
        int max = 1, localMax=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                localMax++;
            }
            else if(arr[i]<=arr[i-1]){
                if(localMax>max){
                    max = localMax;
                }
                localMax = 1;
            }
        }
        if(max<localMax)
            max = localMax;
        return max;
    }
}