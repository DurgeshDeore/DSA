class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->{
            if(b[1] == a[1])
                return a[0] - b[0];
            return a[1] - b[1];
        });

        for(int key: map.keySet()){
            pq.add(new int[]{key, map.get(key)});
            if(pq.size() > k) pq.poll();
        }

        int i=0;
        while(i<k)
            res[i++] = pq.poll()[0];
        
        return res;
    }
}
