class Solution {

    public List<String> res = new ArrayList<>();
    public HashMap<Character, ArrayList<Character>> map = new HashMap<>();

    public void backtrack(StringBuilder sb, String digits, int i){
        if(i == digits.length()){
            res.add(sb.toString());
            return;
        }
        char cur = digits.charAt(i);
        for(char c: map.get(cur)){
            sb.append(c);
            backtrack(sb, digits, i+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        int n=digits.length();
        
        for(char c='2'; c<='9'; c++) map.put(c, new ArrayList<>());
        for(char c='a'; c<='z'; c++){
            if(c < 'd') map.get('2').add(c);
            else if(c < 'g') map.get('3').add(c);
            else if(c < 'j') map.get('4').add(c);
            else if(c < 'm') map.get('5').add(c);
            else if(c < 'p') map.get('6').add(c);
            else if(c < 't') map.get('7').add(c);
            else if(c < 'w') map.get('8').add(c);
            else map.get('9').add(c);
        }
        backtrack(new StringBuilder(), digits, 0);
        return res;
    }
}
