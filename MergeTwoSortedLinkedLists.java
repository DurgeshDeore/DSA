//method = dummy ptr
//optimized 
//use curr ptr to change link beetween nodes
class Solution {
    Node sortedMerge(Node head1, Node head2) {
        Node curr=null,dummy;
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        if(head1.data < head2.data){
            curr=head1;
            dummy=curr;
            head1=head1.next;
        }else{
            curr=head2;
            dummy=curr;
            head2=head2.next;
        }
        while(head1!=null&& head2!=null){
            if(head1.data <= head2.data){
                curr.next=head1;
                head1=head1.next;
                curr=curr.next;
            }else{
                curr.next=head2;
                head2=head2.next;
                curr=curr.next;
            }
        }
        if(head1!=null){
            curr.next=head1;
        }
        if(head2!=null){
            curr.next=head2;
        }
        return dummy;
    }
}
