// 17.55%
class Solution {
    public int minSteps(String s, String t) {
        int rem=0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(char ch: t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
        }
        for(int val: map.values()) rem+=val;
        return rem;
    }
} 
