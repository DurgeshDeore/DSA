//method = freq[] arr
//optimized appraoch
class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        int[] freq= new int[26];
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<s2.length(); i++){
            freq[s2.charAt(i)-'a']--;
        }
        for(int ele: freq){
            if(ele != 0){
                return false;
            }
        }
        return true;
    }
}
