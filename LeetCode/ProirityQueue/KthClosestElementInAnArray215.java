class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(k>nums.length) return -1;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: nums) pq.add(ele);
        for(int i=0;i<k-1;i++) pq.poll();
        return pq.poll();
    }
}
