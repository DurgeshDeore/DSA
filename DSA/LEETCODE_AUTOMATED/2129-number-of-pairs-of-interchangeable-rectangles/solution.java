class Solution {
    public static long findGCD(long a, long b) {
        return b == 0 ? a : findGCD(b, a % b);
    }
    public static long getFact(long n) {
        if(n == 0) return 0; 
        return n + getFact(n-1);
    }
    public long interchangeableRectangles(int[][] rectangles) {
        int n=rectangles.length;
        long res =0;
        // String[] ratios = new String[n];
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++) {
            long gcd = findGCD(rectangles[i][0], rectangles[i][1]);
            // ratios[i] = (rectangles[i][0]/ gcd) + ":" + (rectangles[i][1] / gcd);
            String ratio = (rectangles[i][0]/ gcd) + ":" + (rectangles[i][1] / gcd);
            map.put(ratio, map.getOrDefault(ratio, 0)+1);
        }
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(ratios[i].equals(ratios[j])) res += 1;
        //     }
        // }
        for(String key: map.keySet()){
            res += getFact(map.get(key)-1);
        }
        return res;
    }
}
