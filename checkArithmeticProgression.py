class Solution:
    def checkIsAP(self, arr):
        arr.sort() #sort the array first
        deff = arr[1] - arr[0] #find the difference between two numbers
        for i in range(1,len(arr)-1):
            if arr[i]-arr[i-1] != deff: #if diff is not as the we expected the return false
                return False
        return True
