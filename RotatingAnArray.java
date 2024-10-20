class Solution {
    void leftRotate(int arr[], int d) {
        int temp[]= new int[d];
        int n = arr.length;
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }
        for(int i=0, j=d; j<n; i++,j++){
            arr[i] = arr[j];
        }
        for(int i=0,j=n-d; i<d; i++,j++){
            arr[j] = temp[i];
        }
    }
}
