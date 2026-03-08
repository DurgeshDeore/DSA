class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, l=0, maxFreq =0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            maxFreq = Math.max(maxFreq, map.get(s.charAt(r)));

            while(((r-l)+1) - maxFreq > k){
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)-1);
                if(map.get(s.charAt(l)) <= 0)
                    map.remove(s.charAt(l));
                l++;
            }
            res = Math.max(res, (r-l)+1);
        }
        return res;
    }
}
