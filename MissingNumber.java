class Solution {
    public static int missingNumber(int n, int[] arr) {
        if(arr.length == 1){
            if(arr[0] == 2){
                return 1;
            }
            return 2;
        }
        int freq[] = new int[n+2];
        int indx = -1;
        for(int i=0; i < arr.length; i++){
            indx = arr[i];
            freq[indx] += 1;
        }
        for(int i=1; i < freq.length; i++){
            if(freq[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
