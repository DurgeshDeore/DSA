//method = hashing
class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        int sum=0;
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(0,1);
        for(int ele: arr){
            sum+=ele;
            if(map.containsKey(sum) ){
                return true;
            }else{
                map.put(sum,0);
            }   
        }
        return false;
    }
}
