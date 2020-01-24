/*
    HackerEarth
    https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/shubham-and-xor-8526868e/
    Topic: Sorting
    Date: 24-01-2020

    Solution Approach (Using HashMap): 
        1. Store the elements in the HashMap
        2. If the occurrence of the count of an element is greater than 1, then find nC2 and add it to ans variable.
*/

import java.io.*;
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        StringTokenizer line = new StringTokenizer(buff.readLine());
        Map<Long,Long> hmap = new HashMap<>();
        long temp;
        for(int i=0;i<n;i++){
            temp = Long.parseLong(line.nextToken());
            hmap.put(temp,hmap.containsKey(temp) ? hmap.get(temp)+1L : 1L);
        }
        long ans = 0;
        for(Long value : hmap.values()){
            ans += value>1 ? (value*(value-1))/2 : 0;
        }
        System.out.println(ans);
    }
}