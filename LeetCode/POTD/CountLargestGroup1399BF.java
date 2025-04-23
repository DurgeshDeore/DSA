//5.38%
class Solution {
    public int digitSum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int countLargestGroup(int n) {
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=1; i<=n; i++){
            int sum = digitSum(i);
            map.put(sum ,map.getOrDefault(sum ,0)+1);
            res = Math.max(res, map.get(sum));
        }
        int ans = 0;
        for (int count : map.values()) {
            if (count == res) ans++;
        }
        return ans;
    }
}
