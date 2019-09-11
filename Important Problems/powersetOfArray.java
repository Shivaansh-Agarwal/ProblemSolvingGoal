/* 
    * Print all Subsets of a Given Array
    * OR
    * Generate a Powerset of a Given Array

    => Using Bitwise
    I/P: 1 2 3
    O/P:
        
        1,
        2,
        1, 2,
        3,
        1, 3,
        2, 3,
        1, 2, 3,
*/
import java.io.*;
class PowersetOfArray{
    public static void main(String args[]) throws IOException{
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n: ");
        int n = Integer.parseInt(buff.readLine());
        System.out.println("Enter the elements in the array: ");
        String temp[] = buff.readLine().split(" ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = Integer.parseInt(temp[i]);
        //The number of sets that can be generated from an array of length n is 2^n or 1<<n;
        int numberOfSets = 1<<n;
        // This outer loop will be used to generate 1 set at a time out of powerset.
        for(int i=0; i<numberOfSets; i++){
            // The maximum length of powerset will be n which will contain all the elements.
            for(int j=0;j<n;j++){
                if((i & (1<<j))>0){
                    System.out.print(arr[j] + ", ");
                }
            }
            System.out.println("");
        }
    }
}