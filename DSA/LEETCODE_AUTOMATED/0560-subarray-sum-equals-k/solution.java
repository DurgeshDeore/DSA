class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0, sum=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        for(int ele: nums){
            sum+=ele;
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
