class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        int m=pattern.length(), n=strs.length;
        if(m!=n) return false;
        HashMap<Character, String> map1 = new HashMap<>();
        for(int i=0; i<m; i++){
            char c = pattern.charAt(i);
            if(!map1.containsKey(c))
                map1.put(c, strs[i]);
            else if(!map1.get(c).equals(strs[i]))
                return false;
        }
        HashMap<String, Character> map2 = new HashMap<>();
        for(int i=0; i<m; i++){
            char c = pattern.charAt(i);
            if(!map2.containsKey(strs[i]))
                map2.put(strs[i], c);
            else if(map2.get(strs[i]) != c)
                return false;
        }
        // for(int i=0; i<m; i++){
        //     char c = pattern.charAt(i);
        //     if(!map.get(c).equals(strs[i]))
        //         return false;
        // }
        return true;
    }
}
