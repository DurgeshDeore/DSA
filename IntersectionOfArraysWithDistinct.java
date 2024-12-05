//method =  use inbuilt da hashmap
class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int ele: a){
            map.put(ele,map.getOrDefault(ele,0)+1); //count freq
        }
        for(int ele: b){
            map.put(ele,map.getOrDefault(ele,0)+1); //count freq
        }
        int cnt=0;
        for(int ele: map.keySet()){
            if(map.get(ele) >= 2){ //if freq is > 2 the increament cnt
                cnt++;
            }
        }
        return cnt;
    }
}
