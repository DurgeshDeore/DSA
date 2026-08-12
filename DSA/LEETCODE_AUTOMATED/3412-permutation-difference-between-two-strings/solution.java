class Solution {
    public int findPermutationDifference(String s, String t) {
        int n=s.length(), res=0;
        int[] pos1 = new int[26];
        int[] pos2 = new int[26];
        
        for(int i=0; i<n; i++) pos1[s.charAt(i)-'a'] = i;
        for(int i=0; i<n; i++) pos2[t.charAt(i)-'a'] = i;

        for(int i=0; i<n; i++) {
            res += Math.abs(pos1[s.charAt(i)-'a'] - pos2[s.charAt(i)-'a']);
        }

        return res;
    }
}
