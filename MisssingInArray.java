//method = two sum
class Solution {
    int missingNumber(int arr[]) {
        int n=arr.length;
        int sum=(n+1)*(n+2)/2, temp=0; //find the actual sum
        for(int i=0;i<n;i++){
            temp+=arr[i]; //find total sum of elements
        }
        return sum-temp;  //return the result
    }
}
