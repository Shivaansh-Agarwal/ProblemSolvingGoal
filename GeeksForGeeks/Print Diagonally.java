/*
	Problem: Give a N*N square matrix, print its anti-diagonals.

	Link: https://practice.geeksforgeeks.org/problems/print-diagonally/0
	GeeksForGeeks
	Topic: Matrix
	Date: 25-01-2020

	Ex:
		I/P:
			1 2 3
			4 5 6
			7 8 9
		O/P:
			1 2 4 3 5 7 6 8 9
		Explanation:
			[ 
  				[1],
  				[2, 4],
  				[3, 5, 7],
  				[6, 8],
  				[9]
			]
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
	        StringTokenizer line = new StringTokenizer(buff.readLine());
	        int arr[][] = new int[n][n];
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                arr[i][j] = Integer.parseInt(line.nextToken());
	            }
	        }
	        // Loop for moving from L->R across Columns
	        for(int i=0;i<n;i++){
	            int row=0, col=i;
	            while(row<n && col>=0){
	                System.out.print(arr[row][col] + " ");
	                row++;
	                col--;
	            }
	        }
	        // Loop for moving from T->B across Rows from row 1 to row n
	        for(int j=1;j<n;j++){
	            int row=j, col=n-1;
	            while(row<n && col>=0){
	                System.out.print(arr[row][col] + " ");
	                row++;
	                col--;
	            }
	        }
	        System.out.println("");
	    }
	}
}