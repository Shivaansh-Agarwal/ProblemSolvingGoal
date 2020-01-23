/*	
	HackerEarth
	https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/min-max-difference/
	Topic: Sorting
	Date: 23-01-2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buff.readLine());
        while(t-->0){
            String inp1[] = buff.readLine().split("\\s+");
            int n = Integer.parseInt(inp1[0]);
            int m = Integer.parseInt(inp1[1]);
            String inp2[] = buff.readLine().split("\\s+");
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(inp2[i]);
            int temp,k;
            for(int i=n-1;i>0;i--){
            	k=0;
                for(int j=0;j<i;j++){
                    if(arr[j]>arr[j+1]){
                    	k++;
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                if(k==0)
                	break;
            }
            int sumFirst = 0, sumLast=0;
            for(int i=0;i<n-m;i++){
                sumFirst += arr[i];
            }
            for(int i=m;i<n;i++){
                sumLast += arr[i];
            }
            System.out.println(sumLast-sumFirst);
        }
    }
}
