class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int maxMatched = 0;
        StringBuilder res = new StringBuilder();
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char ch: licensePlate.toCharArray()){
            if(Character.isLetter(ch)){
                char c = Character.toLowerCase(ch);
                map1.put(c, map1.getOrDefault(c, 0)+1); 
            }
        }
        for(String word: words){
            HashMap<Character, Integer> map2 = new HashMap<>();
            for(char ch: word.toCharArray()){
                if(Character.isLetter(ch)){
                    char c = Character.toLowerCase(ch);
                    map2.put(c, map2.getOrDefault(c, 0)+1);
                }
            }
            boolean matched = true;
            for(char c: map1.keySet()){
                if(!map2.containsKey(c) || map2.get(c) < map1.get(c)) {
                    matched = false;
                    break;
                }
            }
            if(matched){
                if(res.length() == 0 || word.length() < res.length()){
                    res = new StringBuilder(word);
                }
            }
        }
        return res.toString();
    }
}
