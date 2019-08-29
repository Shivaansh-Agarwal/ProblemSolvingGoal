class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        if(n==0){
            return -1;
        }
        if(n==1){
            return nums[0];
        }
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = nums[0];
        for(int i=1;i<n;i++){
            left[i] = left[i-1] + nums[i];
        }
        right[n-1] = nums[n-1];
        for(int i=n-2; i>=0;i--){
            right[i] = right[i+1] + nums[i];
        }
        //System.out.println(Arrays.toString(left));
        //System.out.println(Arrays.toString(right));
        int index=-1;
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}