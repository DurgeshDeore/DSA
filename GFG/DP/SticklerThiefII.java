class Solution {
    int houseRrobber(int[] arr, int n){
        int prev1=0, cur=0, prev2=arr[0];
        for(int i=1; i<n; i++){
            cur = Math.max(arr[i]+prev1, prev2);
            prev1=prev2;
            prev2=cur;
        }
        return cur;
    }
    int maxValue(int[] arr) {
        int n=arr.length,j=0,k=0;
        // if(n==1) return 1;
        int[] arr1= new int[n-1];
        int[] arr2= new int[n-1];
        for(int i=0;i<n;i++){
            if(i!=0) arr1[j++]=arr[i];
            if(i!=n-1) arr2[k++]=arr[i];
        }
        return Math.max(houseRrobber(arr1,n-1), houseRrobber(arr2,n-1));
    }
}
