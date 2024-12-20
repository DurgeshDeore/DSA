#optimized solution
class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1:
            return 1
        if n==2:
            return 2
        one,two=1,2
        for i in range(3,n+1):
            one,two = two,one+two
        return two
