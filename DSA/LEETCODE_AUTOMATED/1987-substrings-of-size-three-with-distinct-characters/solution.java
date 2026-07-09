class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length(), cnt = 0, l=0;
        // approach 1: hashing time O(n) space O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        for(int r=0; r<n; r++){
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0)+1);
            if((r-l)+1 == 3){
                if(map.size() == 3) cnt += 1;
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0)-1);
                if(map.get(s.charAt(l)) <= 0) map.remove(s.charAt(l));
                l++;
            }
        }
        return cnt;
    }
}
