class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length, cnt= 0;
        HashSet<Integer> ele = new HashSet<>();
        for(int i: nums) ele.add(i);
        int totalUnique = ele.size();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int r=0,l=0; r<n; r++){
            map.put(nums[r], map.getOrDefault(nums[r], 0)+1);
            while(l<=r && map.size() == totalUnique){
                cnt += n-r;
                map.put(nums[l], map.getOrDefault(nums[l], 0)-1);
                if(map.get(nums[l]) == 0) map.remove(nums[l]);
                l++;
            }
        }

        return cnt;
    }
}
