class Pair{
    int freq;
    String str;
    Pair(String str, int freq){
        this.str = str;
        this.freq = freq;
    }
}
class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        // Hashing + Priority Queue
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq == b.freq){
                return a.str.compareTo(b.str);
            }
            return b.freq - a.freq;
        });
        for(List<String> lst: responses){
            HashSet<String> set = new HashSet<>();
            for(String s: lst) set.add(s);
            for(String key: set){
                map.put(key, map.getOrDefault(key, 0)+1);
            }
        }
        for(String key: map.keySet()){
            Pair p = new Pair(key, map.get(key));
            pq.add(p);
        }
        return pq.poll().str;
    }
}
