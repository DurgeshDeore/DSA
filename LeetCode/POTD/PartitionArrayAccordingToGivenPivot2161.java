//85.34%
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0;
        int res[]=new int[nums.length];
        for(int ele: nums){
            if(ele<pivot) res[i++]=ele;
        }
        for(int ele: nums){
            if(ele==pivot) res[i++]=ele;
        }
        for(int ele: nums){
            if(ele>pivot) res[i++]=ele;
        }
        return res;
    }
}
