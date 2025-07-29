class Solution {
    public class Pair{
        char ch;
        int freq;
        Pair(char ch, int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        PriorityQueue<Pair> pq =new PriorityQueue<>((a, b)->{
            if(a.freq==b.freq){
                return Character.compare(a.ch, b.ch);
            }
            return b.freq-a.freq;
        }); 
        for(char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);
        for(char ch: map.keySet()) pq.add(new Pair(ch, map.get(ch)));
        StringBuilder res=new StringBuilder("");
        while(!pq.isEmpty()){
            Pair cur=pq.poll();
            for(int i=0; i<cur.freq; i++){
                res.append(cur.ch);
            }
        }
        return res.toString();
    }
}
