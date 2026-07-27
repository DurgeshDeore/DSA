class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length, res=0;
        if(n == 1) return res;
        // approach 1: soriting TC O(n log n)
        // Arrays.sort(nums);
        // for(int i=1; i<n; i++) res = Math.max(res, nums[i]-nums[i-1]);
        // return res;
        // approach 2: PriorityQueue 
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num: nums) pq.add(num);
        int prev = pq.poll();
        while(!pq.isEmpty()){
            int cur = pq.poll();
            res = Math.max(res, cur-prev);
            prev = cur;
        }
        return res;
    }
}
