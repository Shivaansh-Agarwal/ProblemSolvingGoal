/*
    HackerEarth
    https://www.hackerearth.com/practice/algorithms/sorting/bubble-sort/practice-problems/algorithm/save-patients/
    Date: 24/01/2020
    Topic: Sorting
*/

import java.io.*;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buff.readLine());
        int vaccines[] = new int[n];
        int patients[] = new int[n];
        StringTokenizer line1 = new StringTokenizer(buff.readLine());
        StringTokenizer line2 = new StringTokenizer(buff.readLine());
        for(int i=0;i<n;i++){
            vaccines[i] = Integer.parseInt(line1.nextToken());
            patients[i] = Integer.parseInt(line2.nextToken());
        }
        Arrays.sort(vaccines);
        Arrays.sort(patients);
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(vaccines[i]<patients[i]){
                flag = false;
                break;
            }
        }
        String ans = flag ? "Yes" : "No";
        System.out.println(ans);
    }
}
