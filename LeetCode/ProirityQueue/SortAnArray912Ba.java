//17.81%
class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele: nums) pq.add(ele);
        int i=0;
        while(!pq.isEmpty()) nums[i++]=pq.poll();
        return nums;
    }
}
