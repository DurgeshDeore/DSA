class Solution {
    public String compressedString(String word) {
        int n = word.length(), cnt = 1;
        StringBuilder res = new StringBuilder();
        for(int i=1; i<n; i++){
            if(word.charAt(i) != word.charAt(i-1)){
                while(cnt > 9){
                    res.append(9);
                    res.append(word.charAt(i-1));
                    cnt -= 9;
                }
                res.append(cnt);
                res.append(word.charAt(i-1));
                cnt = 1;
            }else{
                cnt += 1;
            }
        }
        while(cnt > 9){
            res.append(9);
            res.append(word.charAt(n-1));
            cnt -= 9;
        }
        res.append(cnt);
        res.append(word.charAt(n-1));
        return res.toString();
    }
}
