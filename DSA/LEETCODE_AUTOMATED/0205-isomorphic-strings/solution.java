class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n=s.length();
        if(n <= 1) return true;
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();

        for(int i=0; i<n; i++){
            char key=s.charAt(i), val = t.charAt(i);
            if(map1.containsKey(key)){
                if(map1.get(key) != val) return false;
            }else{
                map1.put(key, val);
            }

            if(map2.containsKey(val)){
                if(map2.get(val) != key) return false;
            }else{
                map2.put(val, key);
            }
        }

        return true;
    }
}
