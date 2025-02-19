//97.79
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length == 1) return stones[0];
        for(int stone: stones) pq.add(stone);
        int res=0;
        while(pq.size()>1){
            int x=pq.poll(), y=pq.poll();
            res=x-y;
            pq.add(res);
        }
        return res;
    }
}
