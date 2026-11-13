class Solution {
    public Trie root;
    public class Trie{
        long cnt = 0;
        // Trie[] child = new Trie[26*26];
        HashMap<Integer, Trie> map = new HashMap<>();
    }
    public long countPrefixSuffixPairs(String[] words) {
        // create both prefix and suffix trie in same trie
        // MLE (594/ 598)
        long res = 0;
        root = new Trie();
        for(String word: words){
            Trie cur = root;
            int n = word.length();
            for(int i=0; i<n; i++){
                int st = word.charAt(i)-'a', end = word.charAt(n-i-1)-'a';
                int indx = st*26 + end; //hash
                // if(cur.child[indx] == null)
                //    cur.child[indx] = new Trie();
                // cur = cur.child[indx];
                cur.map.putIfAbsent(indx, new Trie());
                cur = cur.map.get(indx);
                res += cur.cnt;
            }
            cur.cnt += 1;
        }
        return res;
    }
}
