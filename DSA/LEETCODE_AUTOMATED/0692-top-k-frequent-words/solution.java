class Pair{
    int freq;
    String str;
    Pair(String str, int freq){
        this.str = str;
        this.freq = freq;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // Approach 1: use HashMap + Priorty Queue
        List<String> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(b.freq == a.freq){
                return a.str.compareTo(b.str);
            }
            return b.freq-a.freq;
        });
        for(String word: words) map.put(word, map.getOrDefault(word, 0)+1);
        for(String key: map.keySet()) pq.add(new Pair(key, map.get(key)));
        while(k > 0){
            res.add(pq.poll().str);
            k-=1;
        }
        return res;
    }
}
