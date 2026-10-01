class Solution {
    public String isDuplicate(String s, int size){
        int n = s.length();
        long power = 1, base = 26, mod = 1_000_000_007, curHash = 0;
        
        HashMap<Long, List<Integer>> map = new HashMap<>();
        for(int i=0; i<size; i++) {
            if(i < size-1) power = (power * base ) % mod;
            curHash = (curHash * base + (s.charAt(i) - 'a')) % mod;
        }
        List<Integer> init = new ArrayList<>();
        init.add(0);
        map.put(curHash, init);

        for(int i=1; i<=n-size; i++){
            long left = (s.charAt(i-1)-'a') * power % mod;
            curHash = (curHash - left + mod) % mod;
            curHash = (curHash * base + (s.charAt(i+size-1) - 'a')) % mod;
            if(map.containsKey(curHash)) {
                String curSub = s.substring(i, i+size);
                for(int stIndx : map.get(curHash)){
                    if(s.substring(stIndx, stIndx+size).equals(curSub)) return curSub;
                }
                map.get(curHash).add(i);
            }else{
                List<Integer> curInit = new ArrayList<>();
                curInit.add(i);
                map.put(curHash, curInit);
            }
        }
        return "";
    }
    public String longestDupSubstring(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        // TLC/MLE 66/69
        // Binary search 
        int l=1, r=n;
        while(l<=r){
            int m = l+(r-l)/2;
            String res = isDuplicate(s, m);
            if(res.equals("")){
                r=m-1;
            }else{
                l = m+1;
                if(sb.length() < res.length()) sb = new StringBuilder(res);
            } 
        }
        return sb.toString();
    }
}
