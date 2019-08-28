class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
        int l,r,sum;
        for(int i=0;i<nums.length-2;i++){
            l = i+1;
            r = nums.length-1;
            while(l<r){
                sum = nums[i]+nums[l]+nums[r];
                //System.out.println(sum);
                if(sum==0){
                    //System.out.println("Hi");
                    List<Integer> list= new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    //System.out.println(sum);
                    if(listOfLists.size()==0)
                        listOfLists.add(list);
                    else{
                        if(listOfLists.contains(list)){
                        }
                        else{
                            listOfLists.add(list);
                        }
                    }
                    l++;
                    r--;
                    continue;
                }
                else if(sum<0){
                    l++;
                    continue;
                }
                else if(sum>0){
                    r--;
                    continue;
                }
            }
        }
        return listOfLists;
    }
}