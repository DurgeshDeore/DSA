class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n=nums.length, res=nums[0]+nums[1]+nums[2];
        // Arrays.sort(nums);
        // if(target <= 0){
        //     int pivot = 0;
        //     for(int i=0; i<n; i++){
        //         if(nums[i]>=0){
        //             pivot = i;
        //             break;
        //         }
        //     }
        //     for(int i=0; i<pivot+2 && i<n; i++){
        //         int sum = nums[i]+nums[i+1]+nums[i+2];
        //         if(Math.abs(sum-target) < Math.abs(res-target)) res = sum;
        //     }
        // }else{
        //     for(int i=0; i<=n-3; i++){
        //         int sum = nums[i]+nums[i+1]+nums[i+2];
        //         // int r=Math.abs(res), s=Math.abs(sum), t=Math.abs(target);
        //         if(Math.abs(sum-target) < Math.abs(res-target)) res = sum;
        //     }
        // }
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target) < Math.abs(res-target)) res=sum;
                }
            }
        }
        return res;
    }
}
