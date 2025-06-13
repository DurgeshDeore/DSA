class Solution {
    public boolean isValid(int[] arr, int k, int hr){
        int totalHr = 0;
        for(int ele: arr){
            totalHr += Math.ceil(ele/hr);
        }
        return totalHr <= k;
    }
    public int kokoEat(int[] arr, int k) {
        int max = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
        for(int ele: arr) max = Math.max(max, ele);
        int l = 1, r = max;
        while(l <= r){
            int mid= l+r/2;
            if(isValid(arr, k, mid)){
                ans = Math.min(ans, mid);
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
