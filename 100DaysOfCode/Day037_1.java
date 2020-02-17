/*
	Given a String fint the first non-repeating character from left in a single pass.

	Problem Link: https://practice.geeksforgeeks.org/problems/non-repeating-character/0
	Date: 17/02/2020
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG{
	public static void main (String[] args) throws IOException{
	    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(buff.readLine());
	    while(t-->0){
	        int n = Integer.parseInt(buff.readLine().trim());
	        String s = buff.readLine().trim();
	        int count[] = new int[256];
	        Arrays.fill(count,-1);
	        for(int i=0;i<n;i++){
	            if(count[s.charAt(i)]==-1)
	                count[s.charAt(i)]=i;
	            else
	                count[s.charAt(i)]=-2;
	        }
	        int min = Integer.MAX_VALUE;
	        for(int i=0;i<256;i++){
	            if(count[i]>=0 && count[i]<min)
	                min = count[i];
	        }
	        if(min<256)
	            System.out.println(s.charAt(min));
	        else
	            System.out.println(-1);
	    }
	}
}