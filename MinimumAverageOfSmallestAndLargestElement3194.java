//method = two pointers 
class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        // int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        // for(int ele: nums){
        //     min=min<ele?min:ele;
        //     max=max>ele?max:ele;
        // }

        //return (double)(min+max)/2.0;
        int l=0, r=nums.length-1;
        double ans = (nums[l]+nums[r])/2.0;
        while(l<r){
            ans = ans<((nums[l]+nums[r])/2.0)? ans: ((nums[l]+nums[r])/2.0);
            l++;
            r--;
        }
        return ans;
    }
}
