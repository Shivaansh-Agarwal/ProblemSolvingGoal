class Solution {
    public List<Integer> b_search(int[] arr, int l, int r, int x){
        int mid;
        if(l<=r){
            mid = l + (r-l)/2;
            if(arr[mid]==x){
                List<Integer> ans = new ArrayList<>();
                ans.add(mid);
                return ans;
            }
            else if(arr[mid]<x)
                return b_search(arr,mid+1,r,x);
            else if(arr[mid]>x)
                return b_search(arr,l,mid-1,x);
        }
        List<Integer> ans1 = new ArrayList<>();
        ans1.add(-1);
        ans1.add(l);
        return ans1;
    }
    public int searchInsert(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        ans = b_search(nums, 0, nums.length-1, target);
        if(ans.get(0)!=-1)
            return ans.get(0);
        else{
            return ans.get(1);
        }
    }
}