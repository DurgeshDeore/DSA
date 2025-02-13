class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele: nums){
            if(ele<k) pq.add(ele);
        }
        int opr=0;
        while(!pq.isEmpty()){
            int x=pq.poll();
            opr++;
            if(pq.isEmpty()) break;
            int y=pq.poll();
            long newVal=2L*x+y;
            if(newVal<k) pq.add((int)newVal);
        }
        return opr;
    }
}
