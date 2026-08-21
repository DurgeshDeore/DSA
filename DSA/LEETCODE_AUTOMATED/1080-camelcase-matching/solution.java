class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        int m=pattern.length();
        // Approaach 1: use Pattern Matching algo for all queries (n*m) * n
        List<Boolean> res = new ArrayList<>();
        for(String str: queries){
            int i=0, j=0;
            boolean flag = true;
            for(; i<str.length(); i++){
                char c = str.charAt(i);
                if (j < pattern.length() && c == pattern.charAt(j)) {
                    j++;
                } else if (Character.isUpperCase(c)) {
                    flag = false;
                    break;
                }
            }
            if(!flag) res.add(flag);
            else res.add(j == pattern.length());
        }
        return res;
    }
}
