class Solution {
    public void util(String s, HashSet<String> set, String ans){
        if(s.length() == 0){
            set.add(ans);
            return;
        }
        for(int i=0; i<s.length(); i++){
            int cur = s.charAt(i);
            String newStr = s.substring(0,i)+s.substring(i+1);
            util(newStr,set,ans+(char)cur);
        }
    }
    public ArrayList<String> findPermutation(String s) {
        ArrayList<String> res = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        util(s,set,"");
        for(String i: set) res.add(i);
        return res;
    }
}
