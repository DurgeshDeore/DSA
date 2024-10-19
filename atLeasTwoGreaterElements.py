class Solution:
    def findElements(self,arr):
        arr.sort() #sort the arr
        ans=[]
        for i in range(len(arr)-2): #accept only n-2 element only
            ans.append(arr[i])
        return ans #return the arr
