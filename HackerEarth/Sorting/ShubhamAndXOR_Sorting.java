/*
    HackerEarth
    https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/shubham-and-xor-8526868e/
    Topic: Sorting
    Date: 24-01-2020

    Solution Approach (Using Sorting): 
        1. First Sort the Array
        2. Count the number of occurrences of each number
            if occurrence is greater than 1, then find nC2 and add it to ans variable.
*/

import java.io.*;
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        int arr[] = new int[n];
        StringTokenizer line = new StringTokenizer(buff.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(line.nextToken());
        }
        Arrays.sort(arr);
        int num = arr[0];
        long local_count = 1, global_count=0;
        for(int i=1;i<n;i++){
            if(num==arr[i]){
                local_count++;
            } else {
                global_count += local_count>1 ? (local_count*(local_count-1))/2 : 0;
                num = arr[i];
                local_count = 1;
            }
        }
        global_count += local_count>1 ? (local_count*(local_count-1))/2 : 0;
        System.out.println(global_count);
    }
}