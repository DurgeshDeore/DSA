class Solution {
    public void revArr(int[] arr){
        int l=0, r=arr.length-1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
    }
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        revArr(citations);
        for(int i=0; i<n; i++){
            if(citations[i] < i+1)
                return i;
        }
        return n;
    }
}
