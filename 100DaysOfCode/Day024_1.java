/*
	Merge Sort Revision
	Day-24
	Date: 27/01/2020
*/

import java.lang.*;
import java.io.*;
import java.util.*;

class Main {
	public static void main(String args[]) throws IOException{
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buff.readLine());
		StringTokenizer line = new StringTokenizer(buff.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = Integer.parseInt(line.nextToken());
		}
		mergeSort(arr,0,n-1);
		printSortedArray(arr,n);
	}

	public static void mergeSort(int arr[], int left, int right){
		if(left<right){
			int mid = left + (right-left)/2;
			mergeSort(arr,left,mid);
			mergeSort(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}

	public static void merge(int arr[], int left, int mid, int right){
		int n1 = mid - left + 1;
		int n2 = right - mid;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for(int i=0;i<n1;i++)
			L[i] = arr[left+i];
		for(int j=0;j<n2;j++)
			R[j] = arr[mid+1+j];

		int i=0,j=0,k=left;
		
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			arr[k] = L[i];
			i++;
			k++;
		}

		while(j<n2){
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	public static void printSortedArray(int arr[], int n){
		for(int i=0;i<n;i++){
			System.out.print(arr[i] + " ");
		}
	}
}