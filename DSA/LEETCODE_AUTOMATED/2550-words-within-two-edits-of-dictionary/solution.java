class Solution {
    public boolean isValid(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2){
        int change = 0;
        for(int key: map1.keySet()){
            if(!map2.containsKey(key)){
                change += 1;
            }
            // }else if(map2.get(key) != map1.get(key)){
            //     change += 1;
            // }
            if(change > 2) return false;
        }
        return change <= 2;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> res = new ArrayList<>();
        
        for(int i=0; i<queries.length; i++){
            String s= queries[i];
            for(int j=0; j<dictionary.length; j++){
                String d= dictionary[j];
                int diff=0;
                for(int k=0; k<s.length(); k++){
                    if(s.charAt(k) != d.charAt(k))
                        diff+=1;
                    if(diff > 2) break;
                }
                if(diff<=2){
                    res.add(s);
                    break;
                }
            }
        }
        
        return res;
    }
}
