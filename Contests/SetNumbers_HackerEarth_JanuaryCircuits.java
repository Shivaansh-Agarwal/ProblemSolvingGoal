
/*  
    HackerEarth - (January Circuits 2020)
    Set Numbers
    https://www.hackerearth.com/challenges/competitive/january-circuits-20/algorithm/set-numbers-bea74f5a/
    Date: 20/01/2020
    Author: Shivaansh Agarwal
*/

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(buff.readLine());
        while(t-->0){
            int n = Integer.parseInt(buff.readLine());
            int ans;
            // Getting the position of Most Significant Bit from a number.
            int msb = (int)(Math.log(n)/Math.log(2));
            if(((n+1) & (n)) == 0)
                ans = n;
            else{
                ans = (int)Math.pow(2,msb) - 1;
            }
            System.out.println(ans);
        }
    }
}
