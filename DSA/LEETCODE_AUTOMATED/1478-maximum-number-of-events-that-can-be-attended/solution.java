class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int i=0, res=0, n=events.length, day=0;
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        while(!pq.isEmpty() || i<n){
            if(pq.isEmpty()){
                day=events[i][0];
            }
            while(i<n && events[i][0]<=day){
                pq.offer(events[i][1]);
                i++;
            }
            pq.poll();
            res++;
            day++;
            while(!pq.isEmpty() && pq.peek()<day){
                pq.poll();
            }
        }
        return res;
    }
}
