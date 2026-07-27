class Solution {
    public int heightChecker(int[] heights) {
        int missMatch = 0, n = heights.length;
        int[] sorted = Arrays.copyOf(heights, n);
        Arrays.sort(sorted);
        for(int i=0; i<n; i++){
            if(heights[i] != sorted[i]) missMatch += 1;
        }
        return missMatch;
    }
}
