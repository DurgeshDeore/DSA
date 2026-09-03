class Solution {
    public boolean uniformArray(int[] nums1) {
        int minEle = Integer.MAX_VALUE;
        for(int i: nums1) {
            if(i%2 != 0) minEle = Math.min(minEle, i);
        }
        for(int i: nums1) {
            if(minEle == Integer.MAX_VALUE) break;
            if(i%2==0 && i < minEle) return false;
        }
        return true;
    }
}
