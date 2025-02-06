//method = hashing
//better approach
class Solution {
    public int tupleSameProduct(int[] nums) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                map.put(nums[i]* nums[j], map.getOrDefault(nums[i]* nums[j],0)+1);
            }
        }
        for(int ele: map.values()) {
            if(ele>1) cnt+=(ele*(ele-1)/2)*8;
        }
        return cnt;
    }
}
