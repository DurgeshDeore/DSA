class Solution {
    public HashSet<Character> set;
    public ArrayList<String> removed;

    public void helper(String s, StringBuilder cur, int indx){
        int n = s.length();
        if(indx == n){
            removed.add(new String(cur.toString()));
            return;
        }
        for(int i=0; i<n; i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                cur.append(s.charAt(i));
                helper(s, cur, indx+1);
                set.remove(s.charAt(i));
                cur.deleteCharAt(cur.length()-1);
            }
        }
    }
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        // approach 1: 2^n generate all strings
        set = new HashSet<>();
        // removed = new ArrayList<>();
        // helper(s, new StringBuilder(""), 0);
        // Collections.sort(removed);
        // return removed.get(0);
        
        // approach 2: monotanic stack way
        
        StringBuilder sb = new StringBuilder("");
        int[] pos = new int[26];
        boolean[] taken = new boolean[26];
        for(int i=0; i<n; i++) pos[s.charAt(i)-'a'] = i; //last pos

        for(int i=0; i<n; i++){
            char c = s.charAt(i);
            if(taken[c-'a']) continue; // skip it before removal

            while(sb.length() > 0 && sb.charAt(sb.length()-1) > c && pos[sb.charAt(sb.length()-1)-'a'] > i){
                taken[sb.charAt(sb.length()-1)-'a'] = false;
                sb.deleteCharAt(sb.length()-1);
            }
            sb.append(c);
            taken[c-'a'] = true;
        }

        return sb.toString();
    }
}
