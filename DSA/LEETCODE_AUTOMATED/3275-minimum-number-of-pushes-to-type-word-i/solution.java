class Solution {
    public int minimumPushes(String word) {
        int res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: word.toCharArray()){
            if(!map.containsKey(c)){
                int val = map.size()<8? 1: (map.size() < 16? 2: (map.size() < 24? 3: 4));
                map.put(c, val);
            }
            res += map.get(c);
        }
        return res;
    }
}
