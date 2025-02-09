class Solution {
    public long countBadPairs(int[] nums) {
        if(nums.length<2) return 0;
        long n=nums.length;
        long cnt=0; //good pairs
        long totalPairs=n*(n-1)/2;
        HashMap<Integer,Integer> map=new HashMap<>(); 
        for(int i=0;i<nums.length;i++) {
            int preVal=map.getOrDefault(i-nums[i],0);
            cnt+=preVal;
            map.put(i-nums[i],map.getOrDefault(i-nums[i],0)+1); 
        }
        return totalPairs-cnt;
    }
}
