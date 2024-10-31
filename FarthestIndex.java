class Solution {
    public int findIndex(int[] arr, int x) {
        int indx = -1; //-1 for if element is not found
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                indx = i+1; //update when element is found
            }
        }
        return indx;
    }
}
