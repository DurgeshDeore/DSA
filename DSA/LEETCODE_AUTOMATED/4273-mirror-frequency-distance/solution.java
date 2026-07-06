class Solution {
    public int mirrorFrequency(String s) {
        int res = 0;
        HashSet<Character> seen = new HashSet<>();
        HashMap<Character, Integer> freq = new HashMap<>(); // create freq & mirror map 
        HashMap<Character, Character> mirror = new HashMap<>();
        
        for(char c: s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0)+1);

        for(char i='a', j='z'; i<='z' && j>='a'; i++, j--) mirror.put(i, j);
        for(char i='0', j='9'; i<='9' && j>='0'; i++, j--) mirror.put(i, j);

        for(char c: s.toCharArray()){  // simulate
            char op = mirror.get(c);
            if((seen.contains(c) == false) && ((seen.contains(op)) == false)){
                res += Math.abs(freq.get(c) - freq.getOrDefault(op, 0));
            }
            seen.add(c);
            seen.add(op);
        }
        return res;
    }
}
