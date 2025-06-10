class Solution {
    public int maxDifference(String s) {
        int odd = 0, even = Integer.MAX_VALUE, res=0;
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()) map.put(ch, map.getOrDefault(ch, 0)+1);
        for(int i: map.values()){
            if(i%2 == 0){
                even = Math.min(even, i);
            }else{
                odd = Math.max(odd, i);
            }
            // if(odd != 0 && even != 0) res = Math.max(res, odd-even);
        }
        return odd-even;
    }
}
