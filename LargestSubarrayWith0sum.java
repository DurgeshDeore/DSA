//method = hashing &prefix sum
class Solution {
    int maxLen(int arr[]) {
        int sum=0,len=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            sum+=arr[i];
            // map.put(sum,i);
            if(sum == 0) len=i+1;
            if(map.containsKey(sum)) {
                len=Math.max(len,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return len;
    }
}
