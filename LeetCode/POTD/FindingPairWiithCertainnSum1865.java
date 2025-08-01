class FindSumPairs {
    public int[] n1;
    public int[] n2;
    Map<Integer, Integer> map = new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for(int i: nums2) map.put(i, map.getOrDefault(i, 0)+1);
    }
    
    public void add(int index, int val) {
        map.put(n2[index], map.getOrDefault(n2[index], 0)-1);
        n2[index]+=val;
        map.put(n2[index], map.getOrDefault(n2[index], 0)+1);
    }
    
    public int count(int tot) {
        int cnt = 0;
        for(int i: n1){
            if(map.containsKey(tot-i)){
                cnt+=map.get(tot-i);
            }
        }
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
