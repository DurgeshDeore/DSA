//method = use inbuilt ds
class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head == null){
            return null;
        }
        ArrayList<Integer> res = new ArrayList<>(); //arrlst to store data of ll
        long n=0;
        Node temp=head;
        while(temp!=null){
            res.add(temp.data);
            temp=temp.next;
        }
        temp=head;
        for(int i=k;i<res.size();i++){ //insert from kth pos
            temp.data=res.get(i);
            temp=temp.next;
        }
        for(int i=0;i<k;i++){ //insert remaining elements
            temp.data=res.get(i);
            temp=temp.next;
        }
        return head; //return head
    }
}
