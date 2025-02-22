class Solution {
    public int firstNonRepeating(int[] arr) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int res=0;
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int key: arr){
            if(map.get(key)==1){
                return key;
            }
        }
        return res;
    }
}
