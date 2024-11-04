class Solution {
    //Approach = Cyclic Sort 
    int[] sortArray(int arr[]) {
        if(arr.length <= 1){
            return arr;
        }
        int i=0;
        int currPos =-1; //initial currect postion is  -1
        while(i<arr.length){
            currPos = arr[i]-1; //find currect postion
            if(arr[i] != arr[currPos]){
                //swap with the currect Postion
                int temp = arr[i];
                arr[i] =arr[currPos];
                arr[currPos] = temp;
            }else{ //else increament the i 
                i++; 
            }
        }
        return arr; //return sorted arr
    }
}
