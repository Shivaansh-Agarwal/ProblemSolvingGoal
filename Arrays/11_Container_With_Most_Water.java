class Solution {
    public int findMin(int a, int b){
        return a>=b?b:a;
    }

    //APPROACH-1 O(n^2)
    /*
    public int maxArea(int[] height) {
        int num;
        int area = findMin(height[0],height[1]);
        for(int i=0;i<height.length;i++){
            num = height[i];
            for(int j=i+1;j<height.length;j++){
                if(j==1)
                    continue;
                else
                    area = area>(findMin(height[i],height[j])*(j-i)) ? area : (findMin(height[i],height[j])*(j-i));
            }
        }
        return area;
    }
    */

    // APPROACH-2 O(n)
    public int maxArea(int[] height) {
        int len = height.length;
        int lPointer = 0, rPointer = len-1, maxArea = 0;
        int min = 0;
        while(lPointer<rPointer){
            min = findMin(height[lPointer],height[rPointer]);
            maxArea = maxArea>(min*(rPointer-lPointer)) ? maxArea : (min*(rPointer-lPointer));
            if(height[lPointer]<=height[rPointer])
                lPointer++;
            else if(height[lPointer]>height[rPointer])
                rPointer--;
        }
        return maxArea;
    }
}