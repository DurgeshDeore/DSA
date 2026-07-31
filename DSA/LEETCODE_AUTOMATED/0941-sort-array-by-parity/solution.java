class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // approach 1: countig odd even then merge
        // approach 2: two pointers
        int l=0, r=nums.length-1;
        while(l<r){
            if((nums[l]%2 !=0) && (nums[r]%2 == 0)){    //swap
                int t = nums[l];
                nums[l] = nums[r];
                nums[r] = t;
                l+=1;
                r-=1;
            }
            while(l<r && nums[l]%2 ==0) l+=1;
            while(l<r && nums[r]%2 !=0) r-=1;
        }
        return nums;
    }
}
