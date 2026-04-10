class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length, res=Integer.MAX_VALUE;
        if(n < 3) return -1;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++)
            map.put(nums[i], new ArrayList<>());

        for(int i=0; i<n; i++)
            map.get(nums[i]).add(i);

        for(int i: map.keySet()){
            if(map.get(i).size() < 3) continue;
            for(int j=0; j<map.get(i).size()-2; j++){
                res = Math.min(res, (map.get(i).get(j+1) - map.get(i).get(j+0)) + (map.get(i).get(j+2) - map.get(i).get(j+1)) + (map.get(i).get(j+2) - map.get(i).get(j+0)));
            }
        }
        return res==Integer.MAX_VALUE? -1: res;
    }
}
