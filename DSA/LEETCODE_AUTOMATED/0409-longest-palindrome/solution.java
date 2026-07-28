class Solution {
    public int longestPalindrome(String s) {
        int n=s.length(), res=0, oddMax=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) map.put(c, map.getOrDefault(c, 0)+1);
        for(char key: map.keySet()){
            if(map.get(key)%2 == 0) res += map.get(key);
            else {
                oddMax = 1;
                // oddMax = Math.max(oddMax, map.get(key));
                res += map.get(key)-1;
            }
        }
        return res+oddMax;
    }
}
