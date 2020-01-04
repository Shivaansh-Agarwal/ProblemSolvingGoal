/*
	Kadane's Algorithm for finding the Sum of Subarray having Maximum Sum

	Problem: Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
	Input: [-2,1,-3,4,-1,2,1,-5,4],
	Output: 6
	Explanation: [4,-1,2,1] has the largest sum = 6.

	GeeksForGeeks
		Kadane's Algorithm
		https://practice.geeksforgeeks.org/problems/kadanes-algorithm/0
	LeetCode
		53. Maximum Subarray
		https://leetcode.com/problems/maximum-subarray/

	Explanation: 
		https://backtobackswe.com/videos/max-contiguous-subarray-sum
*/

// This solution has O(n) Time Complexity
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
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++)
	            arr[i] = Integer.parseInt(input[i]);
	        int maxSoFar = arr[0]; 
	        int maxEndingHere = arr[0];
	        for(int i=1;i<n;i++){
	            maxEndingHere = Math.max(maxEndingHere+arr[i],arr[i]);
	            maxSoFar = Math.max(maxEndingHere,maxSoFar);
	        }
	        System.out.println(maxSoFar);
	    }
	}
}