class Solution {
    ArrayList<ArrayList<Integer>> pairs;
    public void getPairs(int[] nums, int i, ArrayList<Integer> cur ){
        if(i == nums.length) return;
        if(cur.size() == 2){
            pairs.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        getPairs(nums, i+1, cur);
        cur.remove(cur.size()-1);
        getPairs(nums, i+1, cur);
    }
    public int arrayPairSum(int[] nums) {
        int res = 0, n = nums.length;
        // pairs = new ArrayList<>();
        // getPairs(nums, 0, new ArrayList<>());
        // for(ArrayList<Integer> pair: pairs){
        //     res += Math.min(pair.get(0), pair.get(1));
        // }
        // return pairs.size();
        Arrays.sort(nums);
        for(int i=0; i<n-1; i+=2){
            res += nums[i];
        }
        return res;
    }
}
