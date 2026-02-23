class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        if(n < k) return false;
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<=n-k; i++){
            set.add(s.substring(i, i+k));
        }
        return set.size() >= Math.pow(2,k);
    }
}
