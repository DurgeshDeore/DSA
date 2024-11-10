//method = use temp arr
//this solutions works on original array
class Solution {
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        int x=d%n;     //find no. of rotations
        int temp[] = new int[x]; 
        for(int i=0;i<x;i++){ //add elements into temp
            temp[i]=arr[i];
        }
        for(int i=x; i<n;i++){ //shift the elements by x postion
            arr[i-x] = arr[i];
        }
        for(int i=n-x; i<n; i++){ //add temp into arr
            arr[i]=temp[i-(n-x)];
        }
    }
}
