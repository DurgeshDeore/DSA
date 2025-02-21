// 74.06%
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==1) return 1;
        int len=0,curLen=1;
        HashSet<Integer> set = new HashSet<>();
        for(int ele: nums) set.add(ele);
        for(int ele: set){
            if(!set.contains(ele-1)){
                curLen=1;
                
                while(set.contains(ele+1)){
                    ele=ele+1;
                    curLen++;
                }
                len=Math.max(len,curLen);
            }
        }
        return len;
    }
}
