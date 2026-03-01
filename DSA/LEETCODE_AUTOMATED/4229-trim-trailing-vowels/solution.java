class Solution {
    public String trimTrailingVowels(String s) {
        int n=s.length();
        StringBuilder sb = new StringBuilder(s);
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for(int j = n - 1; j >= 0; j--){
            if(vowels.contains(s.charAt(j)))
                sb.deleteCharAt(j);
            else
                return sb.toString();
        }
        return sb.toString();
    }
}
