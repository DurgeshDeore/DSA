//method = hashing
class Solution {
    public int countSubarrays(int arr[], int k) {
        int sum=0,cnt=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1); //initial
        for(int ele: arr){
            sum+=ele;
            if(map.containsKey(sum-k)){
                cnt+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}
