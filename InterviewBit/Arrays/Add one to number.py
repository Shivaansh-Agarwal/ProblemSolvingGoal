# https://www.interviewbit.com/problems/add-one-to-number/

class Solution:
    # @param A : list of integers
    # @return a list of integers
    def plusOne(self, A):
        s = [str(i) for i in A]
        num = int("".join(s))
        num+=1
        ans = [int(i) for i in str(num)]
        return ans