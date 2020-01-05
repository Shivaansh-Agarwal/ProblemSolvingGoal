/*
	PROBLEM: Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

	Input:
	2
	5
	1 2 3 5
	10
	1 2 3 4 5 6 7 8 10

	Output:
	4
	9

	Explanation:
	Testcase 1: Given array : 1 2 3 5. Missing element is 4.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
	public static void main (String[] args) throws IOException{
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(buff.readLine());
	    while(t-->0){
	        int n = Integer.parseInt(buff.readLine());
	        String input[] = buff.readLine().trim().split("\\s+");
	        int arr[] = new int[n-1];
	        int sumOfArray = 0;
	        for(int i=0;i<n-1;i++){
	            arr[i] = Integer.parseInt(input[i]);
	            sumOfArray += arr[i];
	        }
	        int sumOfFirstN = (n*(n+1))/2;
	        int missingNumber = sumOfFirstN - sumOfArray;
	        System.out.println(missingNumber);
	    }
	}
}