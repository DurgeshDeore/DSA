class Solution {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele: arr) pq.add(ele);
        int i=0;
        while(!pq.isEmpty()) arr[i++]=pq.poll();
    }
}
