class Solution {
    public int countSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res=0, ocrnc=0;
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char key: map.keySet()){
            int n=map.get(key);
            res += n*(n+1)/2;
        }
        return res;
    }
}
