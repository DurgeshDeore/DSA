class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int ans = 0 ;
        for(int ele: derived)ans^=ele;
        return ans==0;
    }
}
