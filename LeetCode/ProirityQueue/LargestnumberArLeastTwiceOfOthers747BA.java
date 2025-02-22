//10.91%
class Solution {
    public int dominantIndex(int[] nums) {
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[0]-a[0]);
        for(int i=0;i<nums.length;i++) pq.add(new int[]{nums[i],i});
        int temp[]=pq.poll();
        int max=temp[0], indx=temp[1];
        int secondMax=pq.poll()[0];
        return (max/2)>=secondMax? indx:-1;
    }
}v
