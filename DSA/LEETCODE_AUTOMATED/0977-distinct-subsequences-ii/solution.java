class Solution {
    Set<String> set;
    public void fun(String s, String sub, int n){
        if(n<0){
            if(sub != null && sub.length() != 0) set.add(sub);
            return;
        }
        fun(s, sub+s.charAt(n), n-1); // take
        fun(s, sub, n-1); // nonTake
    }
    public int distinctSubseqII(String s) {
        int mod = 1_000_000_007, n = s.length();
        // Brute force - Hash + 2^n;
        // set = new HashSet<>();
        // fun(s, "", n-1);
        // return set.size();

        // DP
        int[] dp = new int[n+1];
        dp[0] = 1;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=1; i<n+1; i++){
            char c = s.charAt(i-1);
            dp[i] = (dp[i-1] * 2) % mod;
            if(map.containsKey(c)) dp[i] = (dp[i] - dp[map.get(c)-1] + mod) % mod;
            map.put(c, i);
        }
        return (dp[n]-1 + mod) % mod;
    }
}
