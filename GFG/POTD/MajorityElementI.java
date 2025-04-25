class Solution {
    static int majorityElement(int arr[]) {
        if(arr.length == 1 ){
            return arr[0];
        }
        if(arr.length == 2){
            return -1;
        }
        int maxFreq=-1, res=-1;
        Map<Integer, Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele, map.getOrDefault(ele, 0)+1);
            if(maxFreq < map.get(ele)){
                maxFreq = map.get(ele);
                res = ele;
            }
            
        }
        return (maxFreq > arr.length / 2) ? res : -1;
    }
}
