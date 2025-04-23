class Solution {
    public int[] singleNum(int[] arr) {
        int cnt=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int ele: map.values()){
            if(ele == 1){
                cnt++;
            }
        }
        int i=0;
        int res[] = new int[cnt];
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                res[i++]=entry.getKey();
            }
        }
        Arrays.sort(res);
        return res;
    }
}
