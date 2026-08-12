class Solution {
    public int maximumLength(String s) {
        int n = s.length(), maxLenStr = 0;
        // search all substrings TC n^2 * n
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                int freq = 0;
                String pat = s.substring(i, j);
                Set<Character> set = new HashSet<>();

                for(char c: pat.toCharArray()) set.add(c);

                if(set.size() > 1) continue;

                for(int l=0, r=pat.length(); r<=n; l++, r++){
                    if(s.substring(l, r).equals(pat)) freq += 1;
                }
                
                if(freq >= 3) maxLenStr = Math.max(maxLenStr, (j-i));
            }
        }
        return maxLenStr==0? -1: maxLenStr;
    }
}
