class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele: a) map.put(ele,map.getOrDefault(ele,0)+1);
        for(int ele: b){
            if(map.containsKey(ele) && map.get(ele)>0){
                res.add(ele);
                map.put(ele,map.getOrDefault(ele,0)-1);
            }
        }
        Collections.sort(res);
        return res;
    }
}
