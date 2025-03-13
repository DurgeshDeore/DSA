class Solution {
    boolean areKAnagrams(String s1, String s2, int k) {
        int n=s1.length(), m=s2.length(), diff=0;
        if(n!=m) {
            return false;
        }
        HashMap<Character, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            char ch = s1.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0; i<m; i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch) == 0){
                    map.remove(ch);
                }
            }
        }
        for(int cnt: map.values()) diff+=cnt;
        return diff<=k;
    }
}
