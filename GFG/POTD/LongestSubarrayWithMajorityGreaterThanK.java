class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n=arr.length;
        int sum=0, res=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<n; i++){
            if(arr[i]>k) sum+=1;
            else sum-=1;
            if(sum>0){
                res=Math.max(res, i+1);
            }else{
                if(map.containsKey(sum-1)){
                    res=Math.max(res, i-map.get(sum-1));
                }
            }
            map.putIfAbsent(sum, i);
        }
        return res;
    }
}
