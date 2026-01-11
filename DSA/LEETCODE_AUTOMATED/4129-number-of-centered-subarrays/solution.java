class Solution {
    public int centeredSubarrays(int[] nums) {
        int res = 0, l = 0, r = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // while (r < nums.length ){
            // map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            // sum += nums[r];
            // while (!map.containsKey(sum) && l<r) {
            //     map.put(nums[l], map.getOrDefault(nums[l], 0) - 1);
            //     if (map.get(nums[l]) <= 0)
            //         map.remove(nums[l]);
            //     sum -= nums[r];
            //     l++;
            // }
            // res += (r-l)+1;
            // r++;
        // }
        for(int i=0; i<nums.length; i++){
            HashSet<Integer> set = new HashSet<>();
            int sum =0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                set.add(nums[j]);
                if(set.contains(sum)) res++;
            }
        }
        return res;
    }
}
