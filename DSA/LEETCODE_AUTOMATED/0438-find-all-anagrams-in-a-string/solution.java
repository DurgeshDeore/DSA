class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length(), m = p.length();
        List<Integer> pos = new ArrayList<>();
        char[] pat = p.toCharArray();
        Arrays.sort(pat);
        for(int r=m, l=0; r<n+1; r++, l++){
            char[] temp = s.substring(l, r).toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(temp, pat)) pos.add(l);
        }
        return pos;
    }
}
