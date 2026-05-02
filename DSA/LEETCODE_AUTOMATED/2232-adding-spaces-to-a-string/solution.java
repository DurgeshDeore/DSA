class Solution {
    public String addSpaces(String s, int[] spaces) {
        int last=0, n=spaces.length;
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<n; i++){
            sb.append(s.substring(last, spaces[i]));
            sb.append(" ");
            last = spaces[i];
        }
        sb.append(s.substring(spaces[n-1]));
        return sb.toString();
    }
}
