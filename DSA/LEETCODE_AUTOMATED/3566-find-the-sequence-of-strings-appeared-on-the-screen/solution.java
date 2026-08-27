class Solution {
    public List<String> stringSequence(String target) {
        int n = target.length(), r = 0;
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();

        while(r < n){
            for(char c = 'a'; c <= target.charAt(r); c++){
                sb.append(c);
                res.add(sb.toString());
                if(c != target.charAt(r)) sb.deleteCharAt(sb.length()-1);
            }
            r+=1;
        }

        return res;
    }
}
