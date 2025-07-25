class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if(s.equals(goal)){
            int[] freq = new int[26];
            for(char ch: s.toCharArray()){
                freq[ch-'a']++;
                if(freq[ch-'a'] > 1) return true;
            }
        }
        ArrayList<Integer> cnt = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)) {
                cnt.add(i);
            }
        }
        return cnt.size()==2 && (s.charAt(cnt.get(1)) == goal.charAt(cnt.get(0))) && (s.charAt(cnt.get(0)) == goal.charAt(cnt.get(1)));
     }
}
