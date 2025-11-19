class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for(int n: nums){
            if(original == n)
                original *= 2;
        }
        return original;
    }
}
