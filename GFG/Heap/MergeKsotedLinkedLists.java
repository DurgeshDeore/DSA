class Solution {
    Node mergeKLists(List<Node> arr) {
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->Integer.compare(a.data,b.data));
        for(int i=0;i<arr.size();i++){
            Node temp=arr.get(i);
            while(temp!=null){
                pq.add(temp);
                temp=temp.next;
            }
        }
        Node last=new Node(0);
        Node head=last;
        while(!pq.isEmpty()){
            last.next=new Node(pq.poll().data);
            last=last.next;
        }
        return head.next;
    }
}
