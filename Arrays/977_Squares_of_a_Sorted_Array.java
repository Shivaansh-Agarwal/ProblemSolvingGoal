class Solution {
    public int[] sortedSquares(int[] A) {
        /*
         * APPROACH-1 (Square and Sort) O(nlogn) for(int i=0;i<A.length;i++){ A[i] =
         * A[i]*A[i]; } Arrays.sort(A); return A;
         */

        /*
         * APPROACH-2 (2-Pointer)
         */
        int n = A.length;
        int pos = -1;
        if (A[n - 1] <= 0) {
            pos = n;
        } else {
            for (int i = 0; i < n; i++) {
                if (A[i] == 0) {
                    pos = i + 1;
                    break;
                } else if (A[i] > 0) {
                    pos = i;
                    break;
                }
            }
        }
        int i = pos - 1;
        int j = pos;
        int[] ans = new int[n];
        int k = 0;
        while (i >= 0 && j < n) {
            if (A[i] * A[i] <= A[j] * A[j]) {
                ans[k] = A[i] * A[i];
                i--;
                k++;
            } else {
                ans[k] = A[j] * A[j];
                j++;
                k++;
            }
        }
        while (i >= 0 && k < n) {
            ans[k] = A[i] * A[i];
            k++;
            i--;
        }
        while (j < n && k < n) {
            ans[k] = A[j] * A[j];
            k++;
            j++;
        }
        return ans;
    }
}