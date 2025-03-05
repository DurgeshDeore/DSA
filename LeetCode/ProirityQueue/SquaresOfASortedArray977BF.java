//7.26%
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length, i=0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        //int[] res=new int[n];
        for(int ele: nums){
            pq.add(ele*ele);
        }
        while(!pq.isEmpty()) {
            // res[i]=pq.poll();
            nums[i++]=pq.poll();
        }
        return nums;
    }
}
