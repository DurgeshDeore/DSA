//method hasing
class Solution {
    public int countKDifference(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cnt=0;
        for(int ele: nums){
            cnt+=map.getOrDefault(ele-k,0);
            cnt+=map.getOrDefault(ele+k,0);
            map.put(ele,map.getOrDefault(ele,0)+1);
            
        }
        
        return cnt;
    }

}
