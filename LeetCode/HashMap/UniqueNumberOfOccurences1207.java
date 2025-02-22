//97.97%
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> temp = new ArrayList<>();
        for(int ele: arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele: map.values()){
            if(!temp.contains(ele)){
                temp.add(ele);
            }else{
                return false;
            }
        }
        return true;
    }
}
