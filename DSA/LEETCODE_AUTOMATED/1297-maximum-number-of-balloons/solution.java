class Solution {
    public int maxNumberOfBalloons(String text) {
        int res = Integer.MAX_VALUE;
        int[] freq = new int[26];
        String req = new String("balloon");
        for(char c: text.toCharArray()) freq[c-'a']++;
        for(char c: req.toCharArray()){
            if(c == 'o' || c == 'l') res = Math.min(res, freq[c-'a']/2);
            else res = Math.min(res, freq[c-'a']);
        }
        return res;
    }
}
