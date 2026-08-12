class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        char c = 'a';
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=26; i>0; i--, c++) map.put(c, i);
        for(int i=0; i<s.length(); i++) res += ((i+1) * map.get(s.charAt(i)));
        return res;
    }
}
