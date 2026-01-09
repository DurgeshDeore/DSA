class Solution {
    public int atMost(int[] nums, int k){
        int res=0, l=0, r=0, n=nums.length; 
        Map<Integer, Integer> map = new HashMap<>();
        while(r<n){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            while(map.size() > k){
                map.put(nums[l], map.getOrDefault(nums[l], 0)-1);
                if(map.get(nums[l]) <= 0)
                    map.remove(nums[l]);
                l++;
            }
            // if(map.size() == k){
            //     res += (r-l)+1;
            // }
            res += (r-l)+1;
            r++;
        }
        return res;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        if(k == 1) return atMost(nums, k);
        return atMost(nums, k) - atMost(nums, k-1);
    }
}
