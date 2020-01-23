/*
	HackerEarth
	https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/pizza-confusion/
	Topic: Sorting
	Date: 23-01-2020
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class Pizza {
    String name;
    int score;
    Pizza(String name,int score){
        this.name = name;
        this.score = score;
    }
}

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        Pizza arr[] = new Pizza[n]; 
        for(int i=0;i<n;i++){
            String inp[] = buff.readLine().split("\\s+");
            arr[i] = new Pizza(inp[0],Integer.parseInt(inp[1]));
        }
        Comparator<Pizza> com = new Comparator<Pizza>(){
            @Override
            public int compare(Pizza a, Pizza b){
                if(a.score==b.score){
                    return b.name.compareTo(a.name);
                }
                return a.score - b.score;
            }
        };
        Arrays.sort(arr,com);
        System.out.println(arr[n-1].name);
    }
}
