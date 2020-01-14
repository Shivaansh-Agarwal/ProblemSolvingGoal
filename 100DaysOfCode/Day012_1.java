/*
    https://www.interviewbit.com/problems/pascal-triangle/
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int A) {
        ArrayList<ArrayList<Integer>> finalArray = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<A;i++){
            finalArray.add(new ArrayList<Integer>());
        }
        for(int i=0;i<A;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    finalArray.get(i).add(1);
                }
                else{
                    int sum = finalArray.get(i-1).get(j-1) + finalArray.get(i-1).get(j);
                    finalArray.get(i).add(sum);
                }
            }
        }
        return finalArray;
    }
}
