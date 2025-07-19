class Solution {
    public int maxArea(int[] height) {
        int l=0, r=height.length-1, res=0;
        while(l<r){
            int curWater = Math.min(height[l], height[r])*(r-l);
            res = Math.max(res, curWater);
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
}
