class EventManager {

    PriorityQueue<int[]> pq;
    Map<Integer, Integer> map;
    
    public EventManager(int[][] events) {
        pq= new PriorityQueue<>((a,b)->{
            if(a[1] == b[1]) return a[0]-b[0];
            return b[1]-a[1];
        });
        map = new HashMap<>();
        for(int e[]: events){
            pq.add(new int[]{e[0], e[1]});
            map.put(e[0], e[1]);
        }
    }
    
    public void updatePriority(int eventId, int newPriority) {
        pq.add(new int[]{eventId, newPriority});
        map.put(eventId, newPriority);
    }
    
    public int pollHighest() {
        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            if(map.containsKey(cur[0]) && map.get(cur[0]) == cur[1]){
                map.remove(cur[0]);
                return cur[0];
            }
        }
        return -1;
    }
}

/**
 * Your EventManager object will be instantiated and called as such:
 * EventManager obj = new EventManager(events);
 * obj.updatePriority(eventId,newPriority);
 * int param_2 = obj.pollHighest();
 */
