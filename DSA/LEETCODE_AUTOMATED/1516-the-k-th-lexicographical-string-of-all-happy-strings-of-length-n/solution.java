class Solution {
    public void backtrack(ArrayList<String> list, char[] ch, StringBuilder sb, int n){
        if(sb.length() == n){
            list.add(sb.toString());
            return;
        }
        for(int i=0; i<ch.length; i++){
            if(sb.length() >= 1 && sb.charAt(sb.length()-1) == ch[i])
                continue;
            sb.append(ch[i]);
            backtrack(list, ch, sb, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    
    public String getHappyString(int n, int k) {
        // if(k%3 != 0) return "";
        ArrayList<String> list = new ArrayList<>();
        char[] ch = new char[]{'a', 'b', 'c'};

        backtrack(list, ch, new StringBuilder(""), n);
        return list.size() < k? "": list.get(k-1);
    }
}
