class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0, j=0;
        for(int i=0; i<fruits.length; i++){
            map.put(fruits[i], map.getOrDefault(fruits[i],0)+1);
            while(map.size() > 2){
                map.put(fruits[j], map.getOrDefault(fruits[j],0)-1);
                if (map.get(fruits[j]) == 0) {
                    map.remove(fruits[j]);
                }
                j++;
            }
            res = Math.max(res, i-j+1);
        }
        return res;
    }
}
