//method = freq arr 
class Solution {
    public void sort012(int[] arr) {
        int freq[] = new int[3];
        for(int i=0; i<arr.length; i++){ //loop to find freq of elements
            freq[arr[i]]+=1;
        }
        int i=0;
        int j=0;
        while(i<freq.length){ 
            while(freq[i]!=0){ //based on frequency update the original array
                arr[j]=i;
                j++;
                freq[i]-=1;
            }
            i++;  
        }
        //return arr;
    }
}
