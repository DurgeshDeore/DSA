class Solution {
    public int numberOfSpecialChars(String word) {
        int res=0, n=word.length();
        int[] upper = new int[26];
        int[] lower = new int[26];
        Arrays.fill(upper, -1);
        Arrays.fill(lower, n+1);
        // HashMap<Character, Integer> upper = new HashMap<>();
        // HashMap<Character, Integer> lower = new HashMap<>();
        for(int i=0; i<n; i++){
            char c= word.charAt(i);
            if(Character.isLowerCase(c)){
                // lower.put(c, i);
                lower[c-'a'] = i;
            }else if(Character.isUpperCase(c)){
                // if(!upper.containsKey(c)) upper.put(c, i);
                if(upper[c-'A'] == -1) upper[c-'A'] = i;
            }
             
        }
        for(int i=0; i<26; i++){
            // char up=(char) (i+'a'), low=(char)(i+'A');
            // if(upper.containsKey(up) && lower.containsKey(low)){
            //     if(upper.get(up) > lower.get(low)) res+=1;
            // }
            if(lower[i] < upper[i]) res+=1;
        }
        return res;
    }
}
