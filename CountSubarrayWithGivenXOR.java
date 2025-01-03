//method = hashing
//POTD
class Solution {
    public long subarrayXor(int arr[], int k) {
        int cnt=0,temp=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        for(int ele: arr){
            temp = temp^ele;
            cnt+=map.getOrDefault(temp^k,0); //find target
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        return cnt;
    }
}
