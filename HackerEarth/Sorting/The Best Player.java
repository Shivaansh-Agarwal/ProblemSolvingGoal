/*
    HackerEarth
    https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/the-best-player-1/
    Topic: Sorting
    Date: 25-01-2020

    Here I've implemented the Comparator Interface in order to sort the elements.
*/

import java.util.*;
import java.io.*;

class Fan {
    String name;
    int devotion;
    Fan(String name, int devotion){
        this.name = name;
        this.devotion = devotion;
    }
}

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String inp1[] = buff.readLine().split("\\s+");
        int n = Integer.parseInt(inp1[0]);
        int t = Integer.parseInt(inp1[1]);
        Fan arr[] = new Fan[n];
        for(int i=0;i<n;i++){
            String fanDetails[] = buff.readLine().split("\\s+");
            arr[i] = new Fan(fanDetails[0],Integer.parseInt(fanDetails[1]));
        }
        Comparator<Fan> com = new Comparator<Fan>(){
            @Override
            public int compare(Fan a, Fan b){
                if(a.devotion==b.devotion){
                    return a.name.compareTo(b.name);
                }
                return b.devotion - a.devotion;
            }
        };
        Arrays.sort(arr,com);
        for(int i=0;i<t;i++){
            System.out.println(arr[i].name);
        }
    }
}
