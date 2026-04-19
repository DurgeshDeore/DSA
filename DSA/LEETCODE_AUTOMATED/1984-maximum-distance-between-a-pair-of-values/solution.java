class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int res=Integer.MIN_VALUE, i=0, j=0, n=nums1.length, m=nums2.length;
        while(i<n && j<m){
            if(i <= j && nums1[i] <= nums2[j]){
                res = Math.max(res, j-i);
                j++;
            }else if(nums1[i] > nums2[j]){
                i++;
                j++;
            }else if(i > j){
                j++;
            }
        }
        while(j < m){
            if(n-1 <= j && nums1[n-1] <= nums2[j])
                res = Math.max(res, j-(n-1));
            j++;
        }
        return res==Integer.MIN_VALUE? 0: res;
    }
}
