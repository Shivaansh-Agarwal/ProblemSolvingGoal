/*
	922. Sort Array By Parity II
	https://leetcode.com/problems/sort-array-by-parity-ii/
*/

class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int even=0,odd=1;
        while(true){
            while(even<n && A[even]%2==0)
                even+=2;
            while(odd<n && A[odd]%2!=0)
                odd+=2;
            while(odd>n || even>n)
                return A;
            
            int temp = A[odd];
            A[odd] = A[even];
            A[even] = temp;
        }
    }
}

/*
	Naive Solution 
	Time Complexity: O(n)
	Space Complexity: O(n)

	    int ans[] = new int[n];
	    int odd=1,even=0;
	    for(int i=0;i<n;i++){
	        if(A[i]%2==0){
	            ans[even] = A[i];
	            even+=2;
	        }
	        else{
	            ans[odd] = A[i];
	            odd+=2;
	        }
	    }
	    return odd;
 */

/*
        for(int i=0;i<n;i+=2){
            if(A[i]%2!=0){
                int j = i+1;
                while(j<n){
                    if(A[j]%2==0){
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        break;
                    } else {
                        j++;
                    }
                }
            }
            if(A[i+1]%2==0){
                int j=i+1;
                while(j<n){
                    if(A[j]%2!=0){
                        int temp = A[i+1];
                        A[i+1] = A[j];
                        A[j] = temp;
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        return A;
*/

