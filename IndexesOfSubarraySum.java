//method = sliding window
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res= new ArrayList<>(); //create arrlst
        int start = 0,end = 0; //two pointers to keep track of window's start & end
        int sum=0;
        int n=arr.length;
        for(end=0; end<n; end++){
            sum += arr[end]; //sum of window
            while(sum > target && start<end){ //if it greater than target then decrease by start
                sum -= arr[start];
                start++;
            }
            if(sum == target){ //if sum == terget then add start & end according t indexing
                res.add(start+1);
                res.add(end+1);
                return res;
            }
        }
        //res.clear();
        res.add(-1); //if window is not found then return -1
        return res;
    }
}
