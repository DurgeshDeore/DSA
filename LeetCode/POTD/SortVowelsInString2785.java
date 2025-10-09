class Solution {
    public class Pair{
        char ch;
        int pos;
        Pair(char ch, int pos){
            this.ch = ch;
            this.pos = pos;
        }
    }
    public String sortVowels(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Character.compare(a.ch, b.ch));
        ArrayList<Integer> pos = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));
        for(int i=0; i<s.length(); i++){
            char ch = sb.charAt(i);
            if(vowels.contains(ch)){
                pq.add(new Pair(ch, i));
                pos.add(i);
            }
        }
        int p=0;
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            sb.setCharAt(pos.get(p++), pair.ch);
        }
        return sb.toString();
    }
}
