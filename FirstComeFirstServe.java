//method = hasing
class Solution {

    static int firstElement(int arr[], int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele: arr){
            if(map.get(ele) == k) return ele;
        }
        return -1;
    }
}
