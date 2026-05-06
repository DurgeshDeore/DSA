class Solution {
    public String[] findWords(String[] words) {
        HashSet<Character> r1 = new HashSet<>(Set.of('Q','W','E','R','T','Y','U','I','O','P'));
        HashSet<Character> r2 = new HashSet<>(Set.of('A','S','D','F','G','H','J','K','L'));
        HashSet<Character> r3 = new HashSet<>(Set.of('Z','X','C','V','B','N','M'));
        ArrayList<String> cur = new ArrayList<>();
        for(String s: words){
            boolean flag = true;
            String str = s.toUpperCase();
            if(r1.contains(str.charAt(0))){
                for(char c: str.toCharArray()){
                    if(!r1.contains(c)) flag = false;
                }
            }else if(r2.contains(str.charAt(0))){
                for(char c: str.toCharArray()){
                    if(!r2.contains(c)) flag = false;
                }
            }else if(r3.contains(str.charAt(0))){
                for(char c: str.toCharArray()){
                    if(!r3.contains(c)) flag = false;
                }
            }
            if(flag) cur.add(s);
        }
        if(cur.size() == 0) return new String[0];
        String[] res = new String[cur.size()];
        for(int i=0; i<cur.size(); i++){
            res[i]=cur.get(i);
        }
        return res;
    }
}
