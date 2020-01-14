/*
    https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/
    Date: 14-01-2020
    Time: 8:10AM
    Author: Shivaansh Agarwal
*/

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        List<List<Integer>> arr = new ArrayList<List<Integer>>();
        for(int i=0;i<=A;i++){
            arr.add(new ArrayList<Integer>());
        }
        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        for(int i=0;i<=A;i++){
            for(int j=0;j<=i;j++){
                if(i==A){
                    if(j==0 || j==i){
                        finalArray.add(1);
                    } else {
                        finalArray.add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));  
                    }
                }
                else if(j==0 || j==i){
                    arr.get(i).add(1);
                }
                else {
                    arr.get(i).add(arr.get(i-1).get(j-1)+arr.get(i-1).get(j));
                }
            }
        }
        return finalArray;
    }
}

/****************************************************/
//  Alternative Solution

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> finalArray = new ArrayList<Integer>();
        finalArray.add(1);
        for(int i=1;i<=A;i++){
            finalArray.add((A+1-i)*finalArray.get(i-1)/i);
        }
        return finalArray;
    }
}
