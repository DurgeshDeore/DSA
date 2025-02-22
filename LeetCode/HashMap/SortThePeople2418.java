//91.55%
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i=0;
        HashMap<Integer,String> map= new HashMap<>();
        String[] res= new String[names.length];
        for(String name: names){
            map.put(heights[i++],name);
        }
        int j=0;
        Arrays.sort(heights);
        for(i=names.length-1; i>=0; i--){
            res[j++]=map.get(heights[i]);
        }
        return res;
    }
}
