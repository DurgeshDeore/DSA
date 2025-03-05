//100.00%
class Solution {
    public int lowerBound(int[] nums,int target){
        int low=nums.length,l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                low=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return low;
    }
    public int upperBound(int[] nums,int target){
        int up=nums.length,l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                up=mid;
                r=mid-1;
            }else {
                l=mid+1;
            }
        }
        return up;
    }
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        int n=nums.length;

        if(n<1) return res;

        int low=lowerBound(nums,target), up=upperBound(nums,target)-1;

        if(low == n || nums[low]!= target) return res;

        res[0]=low;
        res[1]=up;
        return res;
    }
}
