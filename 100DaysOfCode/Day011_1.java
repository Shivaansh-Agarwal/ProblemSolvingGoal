/*  https://www.interviewbit.com/problems/spiral-order-matrix-ii/
    Day-11
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> finalArray = new ArrayList<ArrayList<Integer>>();
        /*  This for loop will create an ArrayList of Arralist of size A.
            Suppose if A=4, then 
            finalArray = [[],[],[],[]]
            */
        for(int i=0;i<A;i++){
            finalArray.add(new ArrayList<Integer>(A));
        }
        /*  Now since we want to work on certain indices of the matrix
            We'll assign 0 to all indices so that these indices get created and we 
            can work on them since it is an ArrayList not an Array.
            So again suppose if A=4, then after this step:
            finalArray = [[0,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,0]]
            So now we can access any index and assign the desired value.
            */
        for(int i=0;i<A;i++){
            for(int j=0;j<A;j++){
                finalArray.get(i).add(0);
            }
        }
        /*  l-> leftmost index in which we can fill the elements, initially 0
            r-> rightmost index in which we can fill the elements, initially A-1
            t-> topmost index in which we can fill the elements, initially 0
            b-> bottommost index in which we can fill the elements, initially A-1
            */
        int l=0,r=A-1,t=0,b=A-1;
        int num = 1;
        while(l<=r && t<=b){
            //l->r
            for(int i=l;i<=r;i++){
                finalArray.get(t).set(i,num);
                num++;
            }
            t++;
            
            //t->b
            for(int i=t;i<=b;i++){
                finalArray.get(i).set(r,num);
                num++;
            }
            r--;
            
            //r->l
            for(int i=r;i>=l;i--){
                finalArray.get(b).set(i,num);
                num++;
            }
            b--;
            
            //b->t
            for(int i=b;i>=t;i--){
                finalArray.get(i).set(l,num);
                num++;
            }
            l++;
        }
        return finalArray;
    }
}
