class Solution {
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<arr.length; i++){
            for(int ele: arr[i]) pq.add(ele);
        }
        while(!pq.isEmpty()) res.add(pq.poll());
        return res;
    }
}
