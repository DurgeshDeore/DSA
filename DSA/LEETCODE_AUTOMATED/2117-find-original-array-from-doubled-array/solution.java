class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length, m=0;
        if(n%2 != 0) return new int[]{};
        int[] orignal = new int[n/2];
        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(changed);

        for(int ele: changed) map.put(ele, map.getOrDefault(ele, 0)+1);
        
        // if(map.size() < n/2) return new int[]{};

        for(int ele: changed){
            if(map.get(ele) == 0) continue;
            map.put(ele, map.getOrDefault(ele, 0)-1);
            int key = ele*2;
            if(map.getOrDefault(key, 0) > 0){
                map.put(key, map.getOrDefault(key, 0)-1);
                // if(m == (n/2)) return orignal;
                orignal[m++] = ele;
            }else{
                return new int[]{};
            }                
        }

        return orignal;
    }
}
