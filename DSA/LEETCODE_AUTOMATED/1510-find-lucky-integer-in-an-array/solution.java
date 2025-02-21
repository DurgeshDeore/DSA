class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map= new HashMap<>();
        int res=-1;
        for(int ele: arr) map.put(ele, map.getOrDefault(ele,0)+1);
        for(int key: map.keySet()){
            if(map.get(key)==key){
                res=Math.max(res,key);
            }
        }  
        return res;
    }
}
