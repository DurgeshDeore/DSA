class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        capacity = Arrays.stream(capacity).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();

        int res = 0, sum = 0, cur = 0;
        for(int i: apple) sum+=i;
        for(int i: capacity){
            cur += i;
            res+=1;
            if(cur >= sum) return res;
            
        }
        return res;
    }
}
