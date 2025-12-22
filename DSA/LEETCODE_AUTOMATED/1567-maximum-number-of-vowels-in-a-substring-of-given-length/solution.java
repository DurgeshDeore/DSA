class Solution {
    public int maxVowels(String s, int k) {
        int res = 0, l = 0, cur = 0;
        Set<Character> set = Set.of('a','e','i','o','u');
        for(int r=0; r<s.length(); r++){
            if(set.contains(s.charAt(r))) cur++;
            if(r-l+1 == k){
                res = Math.max(cur, res);
                if(set.contains(s.charAt(l))) cur--;
                l++;
            }
        }
        return res;
    }
}
