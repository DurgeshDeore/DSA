class Solution {
    public int revNum(int n){
        String num = String.valueOf(n);
        StringBuilder sb = new StringBuilder();
        for(int i=num.length()-1; i>=0; i--)   
            sb.append(num.charAt(i));
        return Integer.parseInt(sb.toString());
    }
    public int minMirrorPairDistance(int[] nums) {
        int res = Integer.MAX_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rev = revNum(nums[i]);
            if(map.containsKey(nums[i]))
                res = Math.min(res, Math.abs(i-map.get(nums[i])));
            map.put(rev, i);
        }
        // return map.get(33);
        return res == Integer.MAX_VALUE? -1: res;
    }
}
