class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int noOfZeros = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==0) 
                noOfZeros++;
        }
        if(noOfZeros==0 || noOfZeros==n) 
            return;
        int j = n + noOfZeros;
        for(int i=n-1;i>=0;i--){
            if(--j<n)
                arr[j] = arr[i];
            if(arr[i]==0 && --j<n)
                arr[j] = 0;
        }
    }
}