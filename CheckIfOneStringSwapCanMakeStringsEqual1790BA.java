//method = freq arr % cnt var
//better approach
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] freq=new int[26];
        int cnt=0;
        if(s1.equals(s2)) return true;
        if(s1.length() != s2.length()) return false;
        for(int i=0; i<s1.length(); i++){
            freq[s1.charAt(i) - 97]++;
            freq[s2.charAt(i) - 97]--;
            if(s1.charAt(i) != s2.charAt(i)){
                cnt++;
            }
        }
        for(int ele: freq){
            if(ele != 0) return false;
        }
        return cnt==2? true: false;
    }
}
