class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n == 1) return s;
        boolean flag = false;
        StringBuilder left = new StringBuilder();
        int[] freq = new int[26];
        for(int i=0; i<n/2; i++){
            char c = s.charAt(i);
            freq[c-'a']+=1;
        }
        for(int i=0; i<26; i++){
            char c = (char)('a'+i);
            while(freq[i] > 0){
                left.append(c);
                freq[i] -= 1;
            }
        }
        if(n%2 != 0) flag = true;
        if(flag){
            return left.toString() + s.charAt(n/2) + left.reverse().toString();
        }
        String res = left.toString() + left.reverse().toString();
        return res;
    }
}
