//method = two pointers
//better appraoch
class Solution {
    int search(int[] arr, int key) {
        int l=0, r=arr.length-1;
        while(l <= r){
            if(arr[l]==key){
                return l;
            }else if(arr[r]==key){
                return r;
            }else if(arr[l] < key){
                l++;
            }else{
                r--;
            }
        }
        return -1;
    }
}
