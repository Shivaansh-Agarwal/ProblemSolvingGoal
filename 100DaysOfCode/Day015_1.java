/*
	https://www.interviewbit.com/problems/largest-number/
	Author: Shivaansh Agarwal
	Solution Resource: https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/

	Java Comparator Interface
	https://www.youtube.com/watch?v=0xrhqxTOphI&list=PLsyeobzWxl7oJj5BXYF088REBm-K4c_SR&index=7
	
	Java Strng compareTo Method
	https://beginnersbook.com/2013/12/java-string-compareto-method-example/

	Java How to convert an ArrayList of Strings to a single String
	https://stackoverflow.com/questions/13695547/arraylist-of-strings-to-one-single-string
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        int count=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==0){
                count++;
            }
        }
        if(count==A.size()){
            return "0";
        }
        Comparator<String> com = new Comparator<String>(){
            @Override
            public int compare(String X, String Y){
                String XY = X+Y;
                String YX = Y+X;
                return XY.compareTo(YX)>0 ? -1:1;
            }
        };
        List<String> B = new ArrayList<>();
        for(int i=0;i<A.size();i++){
            B.add(Integer.toString(A.get(i)));
        }
        Collections.sort(B,com);
        String ans = String.join("",B);
        return ans;
    }
}
