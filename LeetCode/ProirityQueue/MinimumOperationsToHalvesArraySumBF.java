class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder());
        double totalSum=0;
        for(int ele: nums){
            totalSum+=(double)ele;
            pq.add((double)ele);
        }
        double sum=totalSum;
        int opr=0;
        while(sum>totalSum/2){
            double x=(double)pq.poll();
            x/=2;
            sum-=x;
            pq.add(x);
            opr++;
        }
        return opr;
    }
}
