class Solution {
    public int powerfulInteger(int[][] intervals, int k) {
        int res=-1,cnt=0;
        // if(intervals.length<1) return -1;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        // Arrays.sort(intervals,(a,b)->{
        //     return a[0]-b[0];
        // });
        
        // for(int i=1; i<intervals.length; i++){
        //     int prev=intervals[i-1][1];
        //     int cur=intervals[i][0];
        //     if(prev>cur){
        //         for(int num=cur; num<=prev; num++){
        //             map.put(num, map.getOrDefault(num, 0)+1);
        //             if(map.get(num)>=k) res=Math.max(res, num);
        //         }
        //     }
        // }
        for(int i[]: intervals){
            int start=i[0], end=i[1]+1;
            map.put(start, map.getOrDefault(start, 0)+1);
            map.put(end, map.getOrDefault(end, 0)-1);
        }
        
        Integer prev=null;
        for(int key: map.keySet()){
            if(prev!=null && cnt>=k) res=key-1;
            cnt+=map.get(key);
            prev=key;
        }
        
        return res;
    }
}
