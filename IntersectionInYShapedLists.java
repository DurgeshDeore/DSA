//method = hashing
class Intersect {
    static Node intersectPoint(Node head1, Node head2) {
        HashMap<Node, Integer> map= new HashMap<>();
        if(head1 == null || head2 == null){
            return head1;
        }
        Node temp1=head1;
        while(temp1 != null){
            map.put(temp1,1);
            temp1=temp1.next;
        }
        Node temp2=head2;
        while(temp2 != null){
            if(map.containsKey(temp2)){
                return temp2;
            }
            temp2=temp2.next;
        }
        return head2;
    }
}
