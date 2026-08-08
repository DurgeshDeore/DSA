class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        // approach 1: use Hashmap
        int n= nums.length;
        List<List<Integer>> res = new ArrayList<>();
        int[] map = new int[n+1];
        for(int i: nums) map[i] += 1;
        while(true){
            List<Integer> cur = new ArrayList<>();
            for(int i=0; i<n+1; i++){
                if(map[i] > 0) cur.add(i);
                map[i] -= 1;
            }
            if(cur.size()==0) break;
            res.add(cur);
        }
        return res;
    }
}
