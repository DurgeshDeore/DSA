//method = kadanes algorithm
class Solution {
    int maxSubarraySum(int[] arr) {
        int max=Integer.MIN_VALUE, currMax=0;
        for(int ele: arr){
            currMax+=ele; //find currrent sum
            max=max>currMax? max: currMax;
            if(currMax<0){ //if currMax<0 it means new subarray
                currMax=0;
            }
        }
        return max;
    }
}
