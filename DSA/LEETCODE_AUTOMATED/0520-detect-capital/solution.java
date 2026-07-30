class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals = 0, n = word.length();
        for(char c: word.toCharArray()){
            if(Character.isUpperCase(c)) capitals += 1;
        }
        if(capitals == n || capitals == 0) return true;
        if(capitals == 1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}
