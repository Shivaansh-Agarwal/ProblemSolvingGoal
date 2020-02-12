/*
    1281. Subtract the Product and Sum of Digits of an Integer
    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

    Date: 10-02-2020
*/

class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0, product=1;
        int digit=0;
        while(n>0){
            digit = n%10;
            sum += digit;
            product *= digit;
            n=n/10;
        }
        return product-sum;
    }
}