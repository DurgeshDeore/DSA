class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: arr) maxHeap.add(ele);
        ArrayList<Integer> res=new ArrayList<>();
        while(k>0){
            res.add(maxHeap.poll());
            k--;
        }
        return res;
    }
}
