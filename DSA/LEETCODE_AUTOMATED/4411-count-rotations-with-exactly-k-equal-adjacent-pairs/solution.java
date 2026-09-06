class Solution {
    public int countRotations(String s, int k) {
        int n =s.length(), rotation = 0;
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<n; i++){
            int cnt = 0;
            for(int j=1; j<n; j++){
                if(sb.charAt(j-1) == sb.charAt(j)) cnt+=1;
            }
            if(cnt == k) rotation += 1;
            char st = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(st);
        }
        return rotation;
    }
}
