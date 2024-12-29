//method = use hashmap
//brute force
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        if(a.length == 0 || b.length ==0 ){
            return new ArrayList<>();
        }
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: a){
            map.put(ele,1);
        }
        for(int ele: b){
            if(map.containsKey(ele) && !res.contains(ele)) {
                res.add(ele);
            }
        }
        return res;
    }
}
