class KthLargest {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>();
        this.k=k;
        for(int ele: nums) pq.add(ele);
    }
    
    public int add(int val) {
        pq.add(val);
        while(pq.size()>k) pq.poll();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
