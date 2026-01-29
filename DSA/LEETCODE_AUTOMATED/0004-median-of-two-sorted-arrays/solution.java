class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double res = 0;
        int n=nums1.length, m=nums2.length, i=0;
        int[] merged = new int[n+m];
        for(int num : nums1) merged[i++] = num;
        for(int num : nums2) merged[i++] = num;
        Arrays.sort(merged);
        if((n+m)%2 == 1) res = merged[(n+m)/2];
        else res = ((double)merged[((n+m)/2)-1]+ merged[((n+m)/2)]) / 2;
        // res = (merged[((n+m)/2)-1] + merged[(n+m)/2]) / 2;
        
        return res;
    }
}
