class Solution {
    public void rotate(int[] arr) {
        int n = arr.length-1;
        int last = arr[n]; //store last element
        for(int i=n; i>=1; i--){
            arr[i] = arr[i-1]; //sift the element by one postion
        }
        arr[0] = last; //update the first element by replacing last element
    }
}
