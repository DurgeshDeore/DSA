class Solution {
    public int missingNumber(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: arr) map.put(ele,1);
        for(int i=1; i<=arr.length+1; i++){
            if(!map.containsKey(i)) return i;
        }
        return -1;
    }
}
