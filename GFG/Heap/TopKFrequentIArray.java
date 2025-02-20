class Solution {
    public ArrayList<Integer> topKFrequent(int[] arr, int k) {
        
        Map<Integer,Integer> map= new HashMap<>();
        PriorityQueue<int[]> pq= new PriorityQueue<>((a,b)->b[1]==a[1]? b[0]-a[0]: b[1]-a[1]);
                                                        //if(ele1 ==ele1) then, find greater. else, find greater freq.
        ArrayList<Integer> res=new ArrayList<>();
        
        if(k>arr.length) return res;
        
        for(int ele: arr) map.put(ele, map.getOrDefault(ele,0)+1);
        
        for(int key: map.keySet()) pq.add(new int[]{key, map.get(key)});
        
        while (res.size()<k) res.add(pq.poll()[0]);
        
        return res;
    }
}
