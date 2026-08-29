class Solution {
    public int romanToInt(String s) {
        int res = 0, n=s.length();
        Map<String, Integer> map = new LinkedHashMap<>(Map.ofEntries(
            Map.entry("M", 1000), Map.entry("CM", 900), Map.entry("D", 500),
            Map.entry("CD", 400), Map.entry("C", 100), Map.entry("XC", 90),
            Map.entry("L", 50), Map.entry("XL", 40), Map.entry("X", 10),
            Map.entry("IX", 9), Map.entry("V", 5), Map.entry("IV", 4),
            Map.entry("I", 1)
        ));
        for(int i=0; i<n; i++){
            if(i+1 < n && map.containsKey(s.substring(i, i+2))){
                res += map.get(s.substring(i, i+2));
                i+=1;
            }else if(map.containsKey(s.substring(i, i+1))){
                res += map.get(s.substring(i, i+1));
            }
        }
        return res;
    }
}
