class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int n = nums.length;
        // TreeSet<Long> set = new TreeSet<>();
        // for(int l=0; l<n; l++){
        //     Long exceed = set.floor((long)nums[l]+valueDiff);
        //     if(exceed != null && exceed >= (long)nums[l]-valueDiff) return true;
        //     set.add((long)nums[l]);
        //     if(set.size() > indexDiff) set.remove((long)nums[l-indexDiff]);
        // }
        TreeSet<Integer> set = new TreeSet<>();
        for(int l=0; l<n; l++){
            Integer exceed = set.floor(nums[l]+valueDiff);
            if(exceed != null && exceed >= nums[l]-valueDiff) return true;
            set.add(nums[l]);
            if(set.size() > indexDiff) set.remove(nums[l-indexDiff]);
        }
        return false;
    }
}
