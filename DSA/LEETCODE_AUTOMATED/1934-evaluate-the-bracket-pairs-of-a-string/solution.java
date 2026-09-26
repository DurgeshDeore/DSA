class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        int i=0;
        StringBuilder res = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        for(List<String> pair: knowledge) map.put(pair.get(0), pair.get(1));

        while(i<s.length()){
            if(s.charAt(i) == '('){
                i++;
                StringBuilder key = new StringBuilder();
                while(i<s.length() && s.charAt(i) != ')'){
                    key.append(s.charAt(i));
                    i++;
                }
                String k = key.toString();
                // res.append(map.getOrDefault(k, "?"));
                if(map.containsKey(k)) res.append(map.get(k));
                else res.append("?");
            }else{
                res.append(s.charAt(i));
            }
            i++;
        }
        return res.toString();
    }
}
