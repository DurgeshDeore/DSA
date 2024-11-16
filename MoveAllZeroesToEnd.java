//method 
class Solution {
    void pushZerosToEnd(int[] arr) {
        int n=arr.length, j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){ 
                arr[j++]=arr[i]; //sift nonzero at the begining
            }
        }
        while(j<n){
            arr[j++]=0; //update rest of elements into zero
        }
    }
}
