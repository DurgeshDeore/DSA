class Pair{
    int freq;
    char ch;
    Pair(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }
}
class Solution {
    public int minimumPushes(String word) {
        // approach 1: use PriorityQueue + HashMap
        int res = 0, i = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            // if(a.freq == b.freq){
            //     return a.ch - b.ch; //min char
            // }
            return b.freq - a.freq; //freq min to max
        });
        for(char c: word.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char key: map.keySet()){
            pq.add(new Pair(key, map.get(key)));
        }
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            if(i < 8) res += cur.freq;
            if(i >= 8 && i < 16) res += 2*cur.freq;
            if(i >= 16 && i < 24) res += 3*cur.freq;
            if(i >= 24) res += 4*cur.freq;
            i+=1;
        }
        return res;
    }
}
