class SmallestInfiniteSet {
    PriorityQueue<Integer> pq;
    HashMap<Integer, Integer> map;
    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        map = new HashMap<>();
        for(int i=1; i<10001; i++){
            pq.add(i);
            map.put(i, 1);
        }
    }
    
    public int popSmallest() {
        int cur = pq.poll();
        map.put(cur, map.getOrDefault(cur, 0)-1);
        if(map.get(cur) <= 0) map.remove(cur);
        return cur;
    }
    
    public void addBack(int num) {
        if(!map.containsKey(num)){
            pq.add(num);
            map.put(num, 1);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */
