class Solution {
    public List<String> findRepeatedDnaSequences(String s) {

        if(s.length() < 10) return new LinkedList<>();

        List<String> res = new LinkedList<>();
        // Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        int l=0, r=0, n=s.length();

        for(; r<=n; r++){
            if((r-l) == 10){
                String sub = s.substring(l, r);
                // if(set.contains(sub)){
                //     res.add(sub);
                //     set.remove(sub);
                // }else{
                //     set.add(sub);
                // }
                map.put(sub, map.getOrDefault(sub, 0)+1);
                l++;
            }
        }
        for(String key: map.keySet()){
            if(map.get(key) >= 2)
                res.add(key);
        }
        return res;
    }
}
