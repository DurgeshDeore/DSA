//method= hashing
//better apprroach
class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> temp = new ArrayList<>();
        for(int ele: map.values()){
            if(temp.contains(ele)){
                return false;
            }else{
                temp.add(ele);
            }
        }
        return true;
    }
}
