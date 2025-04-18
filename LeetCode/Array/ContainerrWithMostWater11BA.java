// 74.94%
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0, r=n-1, ans=0;
        while(l<r){
            int h = Math.min(height[l], height[r]);
            int area = h*(r-l);
            ans = Math.max(area,ans);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
