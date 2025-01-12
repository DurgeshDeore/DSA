class Solution {
    public boolean areOccurrencesEqual(String s) {
        if(s.length() <= 1){ //optional
            return true;
        }
        //HashMap<Character, Integer> map = new HashMap<>();
        int freq[] = new int[26];
        for(char ch: s.toCharArray()){
            //map.put(ch,map.getOrDefault(ch,0)+1);
            freq[ch-'a']++;
        }
        //int freq = map.get(s.charAt(0));
        int occ = freq[s.charAt(0)-'a'];
        //for(int ele: map.values()){
            // if(ele != freq){
            //     return false;
            // }
        // }
        for(int i=1; i<s.length(); i++){
            if(freq[s.charAt(i)-'a'] != occ){
                return false;
            }
        }
        return true;
    }
}
