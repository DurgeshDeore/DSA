class Solution {
    public static int kthSmallest(int[] arr, int k) {
        if(k>arr.length) return -1;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele: arr) pq.add(ele);
        while(k>1){
            pq.poll();
            k--;
        }
        return pq.poll();
    }
}
