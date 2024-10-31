class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        ArrayList<Integer> arr = new ArrayList<>(); //new ds to store q values 
        while(!q.isEmpty()){ 
            arr.add(q.poll());
        }
        int i=arr.size()-1;
        while( i >= 0 ){
            q.add(arr.get(i)); //reverse and store elements in the queue
            i--;
        }
        return q;
    }
}
