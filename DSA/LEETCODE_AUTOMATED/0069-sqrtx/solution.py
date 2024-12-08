class Solution:
    def mySqrt(self, x: int) -> int:
        l,r=1,x
        while l<=r:
            m=(l+r)//2
            m_sqr=m*m
            if m_sqr == x:
                return m
            if m_sqr < x:
                l=m+1
            if m_sqr > x:
                r=m-1
        return r
