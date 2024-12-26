//method = bit manupulation
class Solution {
    int getSingle(int arr[]) {
        int single=0;
        for(int ele: arr){
            single = single ^ ele;
        }
        return single;
    }
}
