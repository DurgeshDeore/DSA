//method = hashing
//better appraoch
class Solution {
    public boolean areOccurrencesEqual(String s) {
        // if(s.length() <= 1){ //optional
        //     return true;
        // }
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int freq = map.get(s.charAt(0));
        for(int ele: map.values()){
            if(ele != freq){
                return false;
            }
        }
        return true;
    }
}
