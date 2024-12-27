//method = hashing
class Solution {

    int countPairs(int arr[], int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt=0;
        for(int ele: arr){
            if(map.containsKey(target-ele)){ cnt+=map.get(target-ele); }
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        return cnt;
    }
}
