class Solution {
    public String customSortString(String order, String s) {
        // Brute force
        int n = s.length();
        StringBuilder res = new StringBuilder();
        int[] freq = new int[26];

        for(char c: s.toCharArray()) freq[c-'a'] += 1;

        for(char c: order.toCharArray()){
            while(freq[c-'a'] > 0){
                res.append(c);
                freq[c-'a'] -= 1;
            }
        }
        for(char c='a'; c<='z'; c++){
            while(freq[c-'a'] > 0){
                res.append(c);
                freq[c-'a'] -= 1;
            }
        }
        
        return res.toString();
    }
}
