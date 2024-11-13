//method = max, currMax method
class Solution {
    public int rowWithMax1s(int arr[][]) {
        int max=0, currMax= 0,indx=-1;
        for(int i=0; i< arr.length; i++){
            currMax=0;
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 1){
                    currMax++;
                    if(max<currMax){
                        max=currMax;
                        indx=i;
                    }
                }
            }
        }
        return indx;
    }
}
