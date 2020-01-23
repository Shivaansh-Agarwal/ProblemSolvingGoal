/*
	HackerEarth
	https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/sort-it-out/description/
	Topic: Sorting
	Date: 23-01-2020
*/

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        String inp[] = buff.readLine().split(" ");
        int arr[] = new int[n];
        Integer index[] = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(inp[i]);
            index[i] = i;
        }
        int temp,k;
        for(int i=n-1;i>0;i--){
            k=0;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    k++;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    temp = index[j];
                    index[j] = index[j+1];
                    index[j+1] = temp;
                }
            }
            if(k==0)
                break;
        }
        for(int i=0;i<n;i++)
            System.out.print(index[i]+" ");
    }
}