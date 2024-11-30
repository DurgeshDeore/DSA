//method =  use inbuild methods
//brute force
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        x=sorted(s)
        y=sorted(t)
        return x==y

