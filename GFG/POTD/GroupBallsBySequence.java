class Solution {
    public boolean validgroup(int[] arr, int k) {
        int n = arr.length;
        if(n%k != 0) return false;
        // Arrays.sort(arr);
        // int prev = arr[0];
        // for(int i=0; i<n; i+=k){
        //     for(int j=i; j<i+k-1; j++){
        //         if(arr[j]+1 != arr[j+1]) return false;
        //     }
        // }
        // return true;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i: arr) map.put(i, map.getOrDefault(i, 0)+1);
        while(!map.isEmpty()){
            int cur = map.firstKey();
            for(int i=cur; i<cur+k; i++){
                if(!map.containsKey(i)) return false;
                map.put(i, map.getOrDefault(i, 0)-1);
                if(map.get(i) == 0) map.remove(i);
            }
        }
        return true;
    }
}
