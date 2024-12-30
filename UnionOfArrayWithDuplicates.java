//method = use hashmap
class Solution {
    public static int findUnion(int a[], int b[]) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int ele: a){
            map.put(ele,1);
        }
        for(int ele: b){
            map.put(ele,1);
        }
        return map.size();
    }
}
