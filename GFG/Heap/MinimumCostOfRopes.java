class Solution {
    public int minCost(int[] arr) {
        if(arr.length<=1) return 0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int sum=0;
        for(int ele: arr) pq.add(ele);
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            sum+=a+b;
            pq.add(a+b);
        }
        return sum;
    }
}
