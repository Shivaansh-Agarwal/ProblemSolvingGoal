/*
    https://www.interviewbit.com/problems/anti-diagonals/

    Time Taken: 49 minutes
    Author: Shivaansh Agarwal
*/

/*
    I/P:
        1 2 3
        4 5 6
        7 8 9

    O/P:
        [ 
            [1],
            [2, 4],
            [3, 5, 7],
            [6, 8],
            [9]
        ]
    
    Observations
        1. If we see the indices of elements in the input matrix:
            00 01 02
            10 11 12
            20 21 22

        2. For a given n*n matrix we'll have (2*n)-1 lines or ArrayLists in the bigger ArrayList

        3. So if we look closely we will notice a pattern here.
            By looking at the indices of the elements in the output we can figure out a pattern.
            [ 
                [00],
                [01, 10],
                [02, 11, 20],
                [12, 21],
                [22]
            ]

            If we get the index of first element of every row, we can easily get the next index 
            by adding 1 in x-coord and subtracting 1 from y-coord.
            So we just need to get the first index of every row in order to find other elements in the row.

            Now in order to calculate the first index of every row-
                Suppose p,q are our indices.
                Initially,
                For Row 1: p=0, q=0
                For Row 2: p=0, q=1 
                For Row 3: p=0, q=2 (Now as soon as we see that q==n-1 we will start incrementing p)
                For Row 4: p=1, q=2
                For Row 5: p=2, q=2

            Now once we've calculated the first indices of the row we can easily calculate indices a,b of further elements by-
            a = p+1
            b = q-1
*/


public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();
        ArrayList<ArrayList<Integer>> finalArray = new ArrayList<ArrayList<Integer>>();
        /*  The following for loop will add n*2-1 Empty ArrayLists in finalArray ArrayList.
            So the finalArray will look something like this-
            for n = 4
            finalArray = [[], [], [], [], [], [], []]
            */
        for(int i=0;i<n*2-1;i++){
            finalArray.add(new ArrayList<>());
        }

        /*  p-> Used to retirieve first element of every row for finalArray from A. (row-num of elment in A)
            q-> Used to retirieve first element of every row for finalArray from A. (column-number of element in A)
            a-> It is used to retirieve other elements in in the row for finalArray from A. (row-num of element in A)
            b-> It is used to retirieve other elements in in the row for finalArray from A. (column-num of element in A)
            */
        int p=0,q=0,a=0,b=0;

        /*  Adding first element of first row.
            First row will contain only 1 element i.e. element at index 0,0 in A.
            */
        finalArray.get(0).add(A.get(p).get(q));
        q++;
        for(int i=1;i<n*2-1;i++){
            finalArray.get(i).add(A.get(p).get(q));
            a = p+1;
            b = q-1;
            if(q==n-1)
                p++;
            else
                q++;
            while(a<n && b>=0){
                finalArray.get(i).add(A.get(a).get(b));
                a++;
                b--;
            }
        }
        return finalArray;
    }
}
