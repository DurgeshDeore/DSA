class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        List<Integer> res = new ArrayList<>();
        for(int num: nums){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        boolean[] seen = new boolean[max+1];
        for(int num: nums) seen[num] = true;
        for(int i=min; i<max; i++){
            if(!seen[i]) res.add(i);
        }
        return res;
    }
}
