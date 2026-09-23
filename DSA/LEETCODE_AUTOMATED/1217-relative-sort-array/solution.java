class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele: arr1) map.put(ele, map.getOrDefault(ele, 0)+1);
        for(int ele: arr2){
            while(map.getOrDefault(ele, 0) > 0){
                arr1[i++] = ele;
                map.put(ele, map.getOrDefault(ele, 0)-1);
            }
        }
        if(i == arr1.length) return arr1;
        int stIndex = i;
        for(int ele: map.keySet()){
            while(map.get(ele) > 0){
                arr1[i++] = ele;
                map.put(ele, map.getOrDefault(ele, 0)-1);
            }
        }
        Arrays.sort(arr1, stIndex, arr1.length);
        return arr1;
    }
}
