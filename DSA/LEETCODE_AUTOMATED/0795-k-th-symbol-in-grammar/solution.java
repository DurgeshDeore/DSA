class Solution {
    public int kthGrammar(int n, int k) {
        // similar to GFG 
        // the idea is every even bit count has 0 and odd has 1 (for 0th index)
        // don't care about the leves care only the pos/k
        // 0
        // 0 1
        // 0 1 1 0
        // 0 1 1 0 1 0 0 1 
        // .. so on 
        if(n == 1) return 0;
        int bits = Integer.bitCount(k-1);
        return bits%2 == 0? 0: 1;
    }
}
