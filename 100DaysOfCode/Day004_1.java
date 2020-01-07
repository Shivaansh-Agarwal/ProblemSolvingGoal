/*
	Merge 2 Sorted Arrays without using Extra Space (GeeksForGeeks)

	https://practice.geeksforgeeks.org/problems/merge-two-sorted-arrays/0/


	Approaches
	https://www.geeksforgeeks.org/merge-two-sorted-arrays-o1-extra-space/
	https://www.geeksforgeeks.org/efficiently-merging-two-sorted-arrays-with-o1-extra-space/

	===========INCOMPLETE================
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
	public static void main (String[] args)throws IOException{
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(buff.readLine());
	    while(t-->0){
	        String input1[] = buff.readLine().trim().split("\\s+");
	        int x = Integer.parseInt(input1[0]);
	        int y = Integer.parseInt(input1[1]);
	        int arr1[] = new int[x];
	        int arr2[] = new int[y];
	        String input2[] = buff.readLine().trim().split("\\s+");
	        for(int i=0;i<x;i++)
	            arr1[i] = Integer.parseInt(input2[i]);
	        String input3[] = buff.readLine().trim().split("\\s+");
	        for(int i=0;i<y;i++)
	            arr2[i] = Integer.parseInt(input3[i]);
	        
	        
	}
}