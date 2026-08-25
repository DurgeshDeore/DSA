class Solution {
    public int missingMultiple(int[] nums, int k) {
        // approch 1: hashing
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums) set.add(num);
        // if(!set.contains(k)) return k;
        for(int i=k; i<= Integer.MAX_VALUE; i+=k){
            if(!set.contains(i)) return i;
        }
        return -1;
    }
}
