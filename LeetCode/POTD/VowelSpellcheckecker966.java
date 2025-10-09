class Solution {
    private String devowel(String word) {
        return word.replaceAll("[aeiou]", "*");
    }
    public String[] spellchecker(String[] wordlist, String[] queries) {
        int n = queries.length;
        String[] res = new String[n];
        Set<String> set = new HashSet<>();
        Map<String, String> lower = new HashMap<>();
        Map<String, String> nonCase = new HashMap<>();
        for(String str: wordlist){
            set.add(str);
            String lwr = str.toLowerCase();
            lower.putIfAbsent(lwr, str);
            String vowels = devowel(lwr);
            nonCase.putIfAbsent(vowels, str);
        }
        for(int i=0; i<n; i++){
            String str = queries[i];
            if(set.contains(str)){
                res[i] = str;
            }else {
                String strLower = str.toLowerCase();
                if(lower.containsKey(strLower)){
                    res[i] = lower.get(strLower);
                }else {
                    String devoweled = devowel(strLower);
                    res[i] = nonCase.getOrDefault(devoweled, ""); 
                }
            }
        }
        return res;
    }
}
