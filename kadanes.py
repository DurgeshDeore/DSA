def maxSubArraySum(self,arr):
        maxSum = arr[0]
        currSum= 0
        for i in range (len(arr)):
            currSum = max(currSum+arr[i],arr[i])
            maxSum = max(maxSum,currSum)
        return maxSum
