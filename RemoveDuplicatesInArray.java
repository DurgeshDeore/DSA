//used inbuild data structure
class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        Set<Integer> res = new LinkedHashSet<>(); // hashset wanst good choice
        for(int i=0; i<arr.length; i++){
            res.add(arr[i]); //only distinct elements where added
        }
        return new ArrayList<>(res); //short cut to convert it into arraylist
        
    }
}
