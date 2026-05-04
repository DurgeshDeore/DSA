class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res =0, l=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0; r<s.length(); r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            while(r-l+1 > map.size() && l<r){
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)-1);
                if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
                l++;
            }
            // while(map.get(s.charAt(r)) ==  map.size() && l<r){
            //     map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)+1);
            //     if(map.get(s.charAt(l)) == 0) map.remove(s.charAt(l));
            //     l++;
            // }
            if(r-l+1 == map.size()) res = Math.max(res, (r-l)+1);
        }
        return res;
    }
}
