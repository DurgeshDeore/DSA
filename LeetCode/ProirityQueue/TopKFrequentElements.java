//82.28
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[1]==a[1]? b[0]-a[0]: b[1]-a[1]);
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
            // int freq=map.getOrDefault(ele,0);
            // pq.add(new int[]{ele,freq});
        }
        for(int key: map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        int[] res = new int[k];
        int i=0;
        while(i<k){
            res[i++]=pq.poll()[0];
        }
        return res;
    }
}
