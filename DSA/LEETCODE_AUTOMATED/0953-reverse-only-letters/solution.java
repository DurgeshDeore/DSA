class Solution {
    public String reverseOnlyLetters(String s) {
        int j=0, k=0;
        StringBuilder chars = new StringBuilder("");
        StringBuilder res = new StringBuilder("");
        HashSet<Integer> pos = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(!Character.isLetter(s.charAt(i))) pos.add(i);
            else chars.append(s.charAt(i));
        }
        chars.reverse();
        for(int i=0; i<s.length(); i++){
            if(pos.contains(i)) res.append(s.charAt(i));
            else res.append(chars.charAt(j++));
        }
        return res.toString();
    }
}
