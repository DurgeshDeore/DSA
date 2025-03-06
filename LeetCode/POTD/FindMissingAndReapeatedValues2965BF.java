//24.14%
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int i=1;
        int ans[] = {-1,-1};
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int[] arr: grid){
            for(int ele: arr){
                map.put(ele, map.getOrDefault(ele,0)+1);
                if(map.get(ele)>1) ans[0]=ele;
            }
        }
        while(map.containsKey(i)){
            i++;
        }
        ans[1]=i;
        return ans;
    }
}
