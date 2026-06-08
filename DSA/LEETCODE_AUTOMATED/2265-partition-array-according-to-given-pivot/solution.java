class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // findPivot(nums, pivot);
        int i=0, n=nums.length;
        int[] res = new int[n];
        for(int num: nums){
            if(num < pivot) res[i++] = num;
        }
        for(int num: nums){
            if(num == pivot) res[i++] = num;
        }
        for(int num: nums){
            if(num >pivot) res[i++] = num;
        }
        return res;
    }
}
