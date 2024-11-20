//method = use inbiuld ds
//better approach
class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // if(k>arr.length){
        //     return -1;
        // }
        Set<Integer> temp = new TreeSet<>();
        int cnt=0;
        for(int ele: arr){
            temp.add(ele);
        }
        for(int ele: temp){
            cnt++;
            if(cnt==k){
                return ele;
            }
        }
        return -1;
    }
}
