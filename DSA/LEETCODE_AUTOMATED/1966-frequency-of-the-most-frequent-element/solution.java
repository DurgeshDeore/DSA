class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length, res=0, l=0;
        long sum=0;
        Arrays.sort(nums);
        // for(int i=n-1; i>=0; i--){
        //     int[] arr = Arrays.copyOf(nums, i+1); 
        //     int freq=0, cur=arr[i], j=i, rem=k;
        //     while(j>=0 && rem >=0){
        //         int need = cur-arr[j];
        //         if(arr[j] <= cur && need <= rem){
        //             rem -= need;
        //             arr[j] += need;
        //             freq += 1;
        //         }else{
        //             break;
        //         }
        //         j--;    
        //     }
        //     res = Math.max(res, freq);
        // }
        for(int r=0; r<n; r++){
            sum += nums[r];
            while(l<=r && ((long) nums[r]* (r-l+1))-sum > k){
                sum -= nums[l++];
            }
            res = Math.max(res, (r-l)+1);
        }
        return res;
    }
}
