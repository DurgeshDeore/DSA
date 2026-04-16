class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int res = Integer.MAX_VALUE, n=words.length;
        for(int i=0; i<n; i++){
            if(words[i].equals(target)){
                int diff = Math.abs(i-startIndex);
                res = Math.min(res, Math.min(n-diff, diff));
            }
        }
        return res == Integer.MAX_VALUE? -1: res;
    }
}
