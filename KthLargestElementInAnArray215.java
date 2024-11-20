//method = use inbuild ds
//optimized solution
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            return -1;
        }
        PriorityQueue<Integer> temp= new PriorityQueue<>(); //use PQ to retains all elements, including duplicates
        for(int ele: nums){
            temp.add(ele);
        }
        for(int i=0;i<n-k;i++){ //poll all element until k
            temp.poll();
        }
        return temp.peek(); //return k
    }
}
