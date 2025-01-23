//method freq arr
//best approach
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] mfreq = new int[26];
        for(int i=0; i<magazine.length(); i++){
            mfreq[magazine.charAt(i) - 'a']++;
        }
        for(int i=0; i<ransomNote.length(); i++){
            if(--mfreq[ransomNote.charAt(i) - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
