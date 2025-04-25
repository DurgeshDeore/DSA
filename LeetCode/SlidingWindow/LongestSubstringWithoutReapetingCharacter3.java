//70.36%
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0, start=0;
        HashSet<Character> set = new HashSet<>();
        for(int end=0; end<s.length(); end++){
            char ch = s.charAt(end);
            while(set.contains(ch)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);
            max = Math.max(max, end-start+1);
        }
        return max;
    }
}
