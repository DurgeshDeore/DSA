class Solution {
    public List<String> partitionString(String s) {
        List<String> res = new ArrayList<>();
        Set<String> seen = new HashSet<>();
        int i=0;
        while(i<s.length()){
            StringBuilder sb = new StringBuilder("");
            int j=i;
            while(j<s.length()){
                sb.append(s.charAt(j));
                if(!seen.contains(sb.toString())){
                    break;
                }
                j++;
            }
            i=j+1;
            if(!seen.contains(sb.toString())){
                seen.add(sb.toString());
                res.add(sb.toString());
            }
        }
        
        return res;
    }
}
