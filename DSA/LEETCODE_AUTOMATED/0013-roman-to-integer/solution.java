class Solution {
    public int romanToInt(String s) {
        int res = 0, n=s.length();
        HashMap<Character, Integer> map = new HashMap<>(
            Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50, 'C', 100, 'D', 500, 'M', 1000)
        );
        for(int i=0; i<n; i++){
            int cur = map.get(s.charAt(i));
            if(i < n-1 && cur < map.get(s.charAt(i+1)))
                res -= cur;
            else 
                res += cur;
        }
        return res;
    }
}
