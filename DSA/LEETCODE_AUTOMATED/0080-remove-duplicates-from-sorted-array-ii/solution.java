class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length, l=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int r=0; r<n; r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            if(map.get(nums[r]) <= 2)
                nums[l++] = nums[r];
        }
        return l;
    }
}
