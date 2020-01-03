/*
	PROBLEM: Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.
	Input:
		2
		4
		1 5 3 2
		3
		3 2 7
	Output:
		2
		-1
*/
		
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
	public static void main (String[] args)throws IOException{
	    //code
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(buff.readLine());
	    while(t-->0){
	        int n = Integer.parseInt(buff.readLine());
	        String line1[] = buff.readLine().trim().split("\\s+");
	        Set<Integer> hset = new HashSet<Integer>();
	        int arr[] = new int[n];
	        for(int i=0;i<n;i++){
	            arr[i] = Integer.parseInt(line1[i]);
	            hset.add(arr[i]);
	        }
	        //System.out.println(hset);
	        Arrays.sort(arr);
	        int count=0;
	        for(int i=0;i<n-2;i++){
	            for(int j=i+1;j<n-1;j++){
	                //System.out.println(Math.abs(arr[i]-arr[j]));
	                if(hset.contains(arr[i]+arr[j]))
	                    count++;
	            }
	        }
	        if(count!=0)
	            System.out.println(count);
	        else
	            System.out.println(-1);
	    }
	}
}