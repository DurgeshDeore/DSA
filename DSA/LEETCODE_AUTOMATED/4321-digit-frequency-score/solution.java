class Solution {
    public int digitFrequencyScore(int n) {
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n!=0){
            int ld = n%10;
            n /= 10;
            map.put(ld, map.getOrDefault(ld, 0)+1);
        }
        for(int k: map.keySet()){
            res += k*map.get(k);
        }
        return res;
    }
}
